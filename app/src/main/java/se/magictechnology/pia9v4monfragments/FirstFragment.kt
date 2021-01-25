package se.magictechnology.pia9v4monfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FirstFragment : Fragment() {

    var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("PIA9DEBUG", "onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("PIA9DEBUG", "onViewCreated")

        val countbtn = view!!.findViewById<Button>(R.id.firstCountBtn)

        countbtn.setOnClickListener {
            counter = counter + 1

            val countertv = view!!.findViewById<TextView>(R.id.firstCounterTV)

            countertv.text = counter.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("PIA9DEBUG", "onStart")

        val countertv = view!!.findViewById<TextView>(R.id.firstCounterTV)

        countertv.text = counter.toString()
        
    }

    override fun onStop() {
        super.onStop()
        Log.d("PIA9DEBUG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("PIA9DEBUG", "onDestroy")
    }
}