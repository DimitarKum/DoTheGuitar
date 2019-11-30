package com.shusha.dotheguitar

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.shusha.dotheguitar.model.displayable_elements.DisplayableChord
import com.shusha.dotheguitar.model.displayable_elements.DisplayableScale
import com.shusha.dotheguitar.model.music_elements.chords.ChordPicker
import com.shusha.dotheguitar.model.music_elements.scales.ScalePicker

class MainActivity : AppCompatActivity() {
    private val chordPicker: ChordPicker =
        ChordPicker()

    private val scalePicker: ScalePicker =
        ScalePicker()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun generateChord(view: View) {
        val txtChordFullName:TextView = findViewById(R.id.txtChordFullName)
        val chosenDisplayableChord: DisplayableChord = chordPicker.pickAChord()
        txtChordFullName.text = chosenDisplayableChord.getFullName()

        val txtChordTab:TextView = findViewById(R.id.txtChordTab)
        txtChordTab.text = chosenDisplayableChord.getTab().toString()
        txtChordTab.alpha = 0.0f
    }

    fun generateScale(view: View) {
        findViewById<TextView>(R.id.txtScaleFullName).text = scalePicker.pickAScale().getFullName()
    }

    fun revealChordTab(view: View) {
        (findViewById<TextView>(R.id.txtChordTab)).alpha = 1.0f
    }

    fun revealScaleTab(view: View) {
//        TODO: implement scale tab then uncomment
//        (findViewById<TextView>(R.id.txtScaleTab)).alpha = 1.0f
    }
}
