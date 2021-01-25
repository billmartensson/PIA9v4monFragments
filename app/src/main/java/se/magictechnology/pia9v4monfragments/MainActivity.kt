package se.magictechnology.pia9v4monfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // supportFragmentManager.beginTransaction().add(R.id.mainFragment, StartFragment()).commit()

        supportFragmentManager.beginTransaction().add(R.id.mainFragmentContainer, FirstFragment()).commit()

        var tab1tv = findViewById<TextView>(R.id.tab1TV)
        var tab2tv = findViewById<TextView>(R.id.tab2TV)
        var tab3tv = findViewById<TextView>(R.id.tab3TV)

        tab1tv.setOnClickListener {
            Log.d("PIA9DEBUG", "Klick tabb 1")
        }

        tab2tv.setOnClickListener {
            Log.d("PIA9DEBUG", "Klick tabb 2")
        }

        tab3tv.setOnClickListener {
            Log.d("PIA9DEBUG", "Klick tabb 3")
        }


    }
}