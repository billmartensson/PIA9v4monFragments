package se.magictechnology.pia9v4monfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var detailbtn = view.findViewById<Button>(R.id.secondReadmoreBtn)

        detailbtn.setOnClickListener {

            val detailfrag = DetailFragment()
            detailfrag.thetext = "Banan"

            activity!!.supportFragmentManager.beginTransaction().add(R.id.mainFragmentContainer, detailfrag).addToBackStack(null).commit()

        }
    }

}