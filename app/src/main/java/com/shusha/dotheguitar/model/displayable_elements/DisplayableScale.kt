package com.shusha.dotheguitar.model.displayable_elements

import com.shusha.dotheguitar.model.music_elements.GuitarString
import com.shusha.dotheguitar.model.music_elements.scales.MusicScale

class DisplayableScale(
    val musicScale: MusicScale,
    val rootString: GuitarString,
    val isLeftOfRoot: Boolean
) {
}