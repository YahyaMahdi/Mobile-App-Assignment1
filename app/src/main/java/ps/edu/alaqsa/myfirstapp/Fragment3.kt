package ps.edu.alaqsa.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class Fragment3 : Fragment(R.layout.fragment_3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvName = view.findViewById<TextView>(R.id.tvDisplayName)
        val btnFinish = view.findViewById<Button>(R.id.btnFinish)
        val cbConfirm = view.findViewById<CheckBox>(R.id.cbConfirm)

        tvName.text = arguments?.getString("user_name")

        cbConfirm.setOnCheckedChangeListener { _, isChecked ->
            btnFinish.isEnabled = isChecked
            btnFinish.text = if (isChecked) "Finish" else "Continue"
        }
    }
}