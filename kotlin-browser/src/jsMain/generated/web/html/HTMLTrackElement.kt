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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/default)
     */
    var default: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/kind)
     */
    var kind: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/label)
     */
    var label: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/readyState)
     */
    val readyState: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src)
     */
    var src: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/srclang)
     */
    var srclang: String

    /**
     * Returns the TextTrack object corresponding to the text track of the track element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/track)
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
