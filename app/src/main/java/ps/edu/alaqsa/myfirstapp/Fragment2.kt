package ps.edu.alaqsa.myfirstapp


import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment_2) {

    interface OnFragmentInteractionListener {
        fun onNameSubmitted(name: String)
    }

    private var listener: OnFragmentInteractionListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) listener = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val etName = view.findViewById<EditText>(R.id.etName)
        view.findViewById<Button>(R.id.btnContinue).setOnClickListener {
            listener?.onNameSubmitted(etName.text.toString())
        }
    }
}