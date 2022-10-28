// Automatically generated - do not modify!

package dom.html

import webvtt.TextTrack

abstract external class HTMLTrackElement :
    HTMLElement {
    var default: Boolean
    var kind: String
    var label: String
    val readyState: Number
    var src: String
    var srclang: String

    /** Returns the TextTrack object corresponding to the text track of the track element. */
    val track: TextTrack
    val ERROR: Short
    val LOADED: Short
    val LOADING: Short
    val NONE: Short
}
