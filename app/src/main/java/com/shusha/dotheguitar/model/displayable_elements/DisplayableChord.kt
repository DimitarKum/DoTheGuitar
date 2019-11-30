package com.shusha.dotheguitar.model.displayable_elements

import com.shusha.dotheguitar.model.music_elements.GuitarString
import com.shusha.dotheguitar.model.music_elements.chords.EMPTY_FRET
import com.shusha.dotheguitar.model.music_elements.chords.MusicChord

class DisplayableChord(
    private val musicChord: MusicChord,
    private val rootString: GuitarString
) {

    fun getFullName(): String {
        return musicChord.text + " on " + rootString.text + " string"
    }

    fun getTab(): DisplayableTab {
        val rootPosition: Int = rootString.findPositionOfNoteOnString(musicChord.rootNote)

        return DisplayableTab(
            musicChord.mode.referenceStringToFretPositions[rootString],
            rootPosition
        )
    }
}