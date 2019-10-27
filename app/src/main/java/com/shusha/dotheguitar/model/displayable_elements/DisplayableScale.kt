package com.shusha.dotheguitar.model.displayable_elements

import com.shusha.dotheguitar.model.music_elements.GuitarString
import com.shusha.dotheguitar.model.music_elements.scales.MusicScale

class DisplayableScale(
    val musicScale: MusicScale,
    val rootString: GuitarString,
    val isLeftOfRoot: Boolean
) {

    fun getFullName(): String {
        return musicScale.rootNote.text + " " + musicScale.scaleMode.modeName +
                " on " + rootString.text + " to the " + if (isLeftOfRoot) "left" else "right"
    }
}