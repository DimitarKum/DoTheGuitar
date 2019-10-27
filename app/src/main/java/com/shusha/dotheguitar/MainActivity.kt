package com.shusha.dotheguitar

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.shusha.dotheguitar.model.DisplayableChord
import com.shusha.dotheguitar.model.ChordPicker

class MainActivity : AppCompatActivity() {
    private val chordPicker: ChordPicker = ChordPicker()

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
        txtChordTab.text = chosenDisplayableChord.getTab()
        txtChordTab.alpha = 0.0f
    }

    fun revealChordTab(view: View) {
        (findViewById<TextView>(R.id.txtChordTab)).alpha = 1.0f
    }
}
