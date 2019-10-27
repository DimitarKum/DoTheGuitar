package com.shusha.dotheguitar.model

import java.util.*

class ChordPicker {
    fun pickAChord(): DisplayableChord{
        val note = MusicNote.values()[Random().nextInt(MusicNote.values().size)]
        val mode = ChordMode.values()[Random().nextInt(ChordMode.values().size)]

        return DisplayableChord(note, mode, (Random().nextInt(2) + 5))
    }
}