package com.shusha.dotheguitar.model

import java.util.*

class ChordPicker {
    fun pickAChord(): String{
        val note:String = MusicNote.values()[Random().nextInt(MusicNote.values().size)].text
        val mode = ChordMode.values()[Random().nextInt(ChordMode.values().size)].symbol

        return note + mode + " on " +  (Random().nextInt(2) + 5) + "th string"
    }
}