// Automatically generated - do not modify!

package web.html

import web.vtt.TextTrack

/**
 * The HTMLTrackElement
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement)
 */
open external class HTMLTrackElement
protected constructor() :
    HTMLElement {
    var default: Boolean
    var kind: String
    var label: String
    val readyState: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src)
     */
    var src: String
    var srclang: String

    /**
     * Returns the TextTrack object corresponding to the text track of the track element.
     */
    val track: TextTrack
    val NONE: ReadyState
    val LOADING: ReadyState
    val LOADED: ReadyState
    val ERROR: ReadyState

    companion object {
        val NONE: ReadyState
        val LOADING: ReadyState
        val LOADED: ReadyState
        val ERROR: ReadyState
    }

    sealed interface ReadyState
}
