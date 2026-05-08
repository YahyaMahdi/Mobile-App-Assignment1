package ps.edu.alaqsa.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Fragment2.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_main)

       
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment2())
                .commit()
        }
    }

    
    override fun onNameSubmitted(name: String) {
        
        val bundle = Bundle().apply {
            putString("user_name", name)
        }

       
        val fragment3 = Fragment3().apply {
            arguments = bundle
        }

     
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment3)
            .addToBackStack(null)
            .commit()
    }
}