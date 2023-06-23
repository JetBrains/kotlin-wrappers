// Automatically generated - do not modify!

package web.html

import webvtt.TextTrack

/**
 * The HTMLTrackElement
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement)
 */
abstract external class HTMLTrackElement :
    HTMLElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/default) */
    var default: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/kind) */
    var kind: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/label) */
    var label: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/readyState) */
    val readyState: Short

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src) */
    var src: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/srclang) */
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
