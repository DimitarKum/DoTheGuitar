package com.shusha.dotheguitar.model.music_elements.chords

import com.shusha.dotheguitar.model.music_elements.GuitarString
import com.shusha.dotheguitar.model.music_elements.Tab


const val EMPTY_FRET: Int = 100

enum class ChordMode(
    val symbol: String,
    val fullName: String,
    val referenceStringToFretPositions: Map<GuitarString, Tab>
) {
    MAJOR(
        "△7",
        "major",
        mapOf(
            GuitarString.FIFTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(EMPTY_FRET),
                GuitarString.FIFTH to intArrayOf(0),
                GuitarString.FOURTH to intArrayOf(2),
                GuitarString.THIRD to intArrayOf(1),
                GuitarString.SECOND to intArrayOf(2),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
                )),
            GuitarString.SIXTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(0),
                GuitarString.FIFTH to intArrayOf(EMPTY_FRET),
                GuitarString.FOURTH to intArrayOf(1),
                GuitarString.THIRD to intArrayOf(1),
                GuitarString.SECOND to intArrayOf(0),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            ))
        )
    ),
    HALF_DIMINISHED(
        "ø7",
        "half-diminished",
        mapOf(
            GuitarString.FIFTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(EMPTY_FRET),
                GuitarString.FIFTH to intArrayOf(0),
                GuitarString.FOURTH to intArrayOf(1),
                GuitarString.THIRD to intArrayOf(0),
                GuitarString.SECOND to intArrayOf(1),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            )),
            GuitarString.SIXTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(0),
                GuitarString.FIFTH to intArrayOf(EMPTY_FRET),
                GuitarString.FOURTH to intArrayOf(0),
                GuitarString.THIRD to intArrayOf(0),
                GuitarString.SECOND to intArrayOf(1),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            ))
        )
    ),
    MINOR(
        "-7",
        "minor",
        mapOf(
            GuitarString.FIFTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(EMPTY_FRET),
                GuitarString.FIFTH to intArrayOf(0),
                GuitarString.FOURTH to intArrayOf(2),
                GuitarString.THIRD to intArrayOf(0),
                GuitarString.SECOND to intArrayOf(1),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            )),
            GuitarString.SIXTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(0),
                GuitarString.FIFTH to intArrayOf(EMPTY_FRET),
                GuitarString.FOURTH to intArrayOf(0),
                GuitarString.THIRD to intArrayOf(0),
                GuitarString.SECOND to intArrayOf(0),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            ))
        )
    ),
    DOMINANT(
        "7",
        "dominant",
        mapOf(
            GuitarString.FIFTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(EMPTY_FRET),
                GuitarString.FIFTH to intArrayOf(0),
                GuitarString.FOURTH to intArrayOf(1),
                GuitarString.THIRD to intArrayOf(0),
                GuitarString.SECOND to intArrayOf(2),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            )),
            GuitarString.SIXTH to Tab(mapOf(
                GuitarString.SIXTH to intArrayOf(0),
                GuitarString.FIFTH to intArrayOf(EMPTY_FRET),
                GuitarString.FOURTH to intArrayOf(0),
                GuitarString.THIRD to intArrayOf(1),
                GuitarString.SECOND to intArrayOf(0),
                GuitarString.FIRST to intArrayOf(EMPTY_FRET)
            ))
        )
    );
}



//    MINOR(
//        "-7",
//        "minor",
//        mapOf(
//            GuitarString.FIFTH to intArrayOf(
//                EMPTY_FRET, 0, 2, 0, 1, EMPTY_FRET
//            ),
//            GuitarString.SIXTH to intArrayOf(
//                0, EMPTY_FRET, 0, 0, 0, EMPTY_FRET
//            )
//        )
//    ),
//    HALF_DIMINISHED(
//        "ø7",
//        "half-diminished",
//        mapOf(
//            GuitarString.FIFTH to intArrayOf(
//                EMPTY_FRET, 0, 1, 0, 1, EMPTY_FRET
//            ),
//            GuitarString.SIXTH to intArrayOf(
//                0, EMPTY_FRET, 0, 0, -1, EMPTY_FRET
//            )
//        )
//    );
//    DOMINANT(
//        "7",
//        "dominant",
//        mapOf(
//            GuitarString.FIFTH to intArrayOf(
//                EMPTY_FRET, 0, -1, 0, -2, EMPTY_FRET
//            ),
//            GuitarString.SIXTH to intArrayOf(
//                0, EMPTY_FRET, 0, 1, 0, EMPTY_FRET
//            )
//        )
//    ),