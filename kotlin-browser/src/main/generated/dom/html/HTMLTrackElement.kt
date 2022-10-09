// Automatically generated - do not modify!

package dom.html

import webvtt.TextTrack

sealed external class HTMLTrackElement :
    HTMLElement {
    var default: Boolean
    var kind: String
    var label: String
    val readyState: Number
    var src: String
    var srclang: String

    /** Returns the TextTrack object corresponding to the text track of the track element. */
    val track: TextTrack
    val ERROR: Number
    val LOADED: Number
    val LOADING: Number
    val NONE: Number
}
