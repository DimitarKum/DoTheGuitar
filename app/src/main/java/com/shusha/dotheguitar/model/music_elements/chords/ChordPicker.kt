package com.shusha.dotheguitar.model.music_elements.chords

import com.shusha.dotheguitar.model.displayable_elements.DisplayableChord
import com.shusha.dotheguitar.model.music_elements.GuitarString
import com.shusha.dotheguitar.model.music_elements.MusicNote
import java.util.*

class ChordPicker {
    private val pickableStrings: List<GuitarString> = listOf(
        GuitarString.FIFTH,
        GuitarString.SIXTH
    )

    fun pickAChord(): DisplayableChord {
        val note = MusicNote.values()[Random().nextInt(
            MusicNote.values().size)]
        val mode = ChordMode.values()[Random().nextInt(ChordMode.values().size)]

        return DisplayableChord(
            MusicChord(note, mode),
            pickableStrings[Random().nextInt(pickableStrings.size)]
        )
    }
}