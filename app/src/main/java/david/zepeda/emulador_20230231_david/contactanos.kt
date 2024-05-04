package david.zepeda.emulador_20230231_david

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class contactanos : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_contactanos, container, false)
        val botonnombre = root.findViewById<Button>(R.id.btncorreoestudiante)
        botonnombre.setOnClickListener {
            Toast.makeText(this.context, "20230231@ricaldone.edu.sv", Toast.LENGTH_SHORT).show()
        }
        return root
    }


}