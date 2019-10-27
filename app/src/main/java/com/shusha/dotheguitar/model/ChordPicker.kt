package com.shusha.dotheguitar.model

import java.util.*

class ChordPicker {
    private val pickableStrings: List<GuitarString> = listOf(GuitarString.FIFTH, GuitarString.SIXTH)

    fun pickAChord(): DisplayableChord {
        val note = MusicNote.values()[Random().nextInt(MusicNote.values().size)]
        val mode = ChordMode.values()[Random().nextInt(ChordMode.values().size)]

        return DisplayableChord(note, mode, pickableStrings[Random().nextInt(pickableStrings.size)])
    }
}