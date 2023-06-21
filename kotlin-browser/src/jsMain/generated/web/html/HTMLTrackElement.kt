// Automatically generated - do not modify!

package web.html

import webvtt.TextTrack

abstract external class HTMLTrackElement :
    HTMLElement {
    var default: Boolean
    var kind: String
    var label: String
    val readyState: Short
    var src: String
    var srclang: String

    /**
     * Returns the TextTrack object corresponding to the text track of the track element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/track)
     */
    val track: TextTrack
    val NONE: Short
    val LOADING: Short
    val LOADED: Short
    val ERROR: Short

    companion object {
        val NONE: Short
        val LOADING: Short
        val LOADED: Short
        val ERROR: Short
    }
}
