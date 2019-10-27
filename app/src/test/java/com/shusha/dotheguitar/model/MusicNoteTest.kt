package com.shusha.dotheguitar.model

import org.junit.Test

import com.google.common.truth.Truth.*

class MusicNoteTest {

    @Test
    fun findDistanceToNote_sameNote_zeroDistance() {
        assertThat(MusicNote.A_SHARP.findDistanceToNote(MusicNote.A_SHARP)).isEqualTo(0)
    }

    @Test
    fun findDistanceToNote_noWrap_success() {
        assertThat(MusicNote.C.findDistanceToNote(MusicNote.F)).isEqualTo(5)
    }

    @Test
    fun findDistanceToNote_wrapAround_positiveDistance() {
        assertThat(MusicNote.F.findDistanceToNote(MusicNote.C)).isEqualTo(7)
    }

    @Test
    fun findDistanceToNote_firstToLastNote_success() {
        assertThat(MusicNote.A.findDistanceToNote(MusicNote.G_SHARP)).isEqualTo(11)
    }

    @Test
    fun findDistanceToNote_lastToFirstNoteWrap_positiveDistance() {
        assertThat(MusicNote.G_SHARP.findDistanceToNote(MusicNote.A)).isEqualTo(1)
    }
}