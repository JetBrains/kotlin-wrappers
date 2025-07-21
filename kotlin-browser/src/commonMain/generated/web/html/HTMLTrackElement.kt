// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import web.vtt.TextTrack

/**
 * The **`HTMLTrackElement`** interface represents an HTML track element within the DOM.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement)
 */
open external class HTMLTrackElement
protected constructor() :
    HTMLElement {
    /**
     * The **`default`** property of the HTMLTrackElement interface represents whether the track will be enabled if the user's preferences do not indicate that another track would be more appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/default)
     */
    var default: Boolean

    /**
     * The **`kind`** property of the HTMLTrackElement interface represents the type of track, or how the text track is meant to be used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/kind)
     */
    var kind: String

    /**
     * The **`label`** property of the HTMLTrackElement represents the user-readable title displayed when listing subtitle, caption, and audio descriptions for a track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/label)
     */
    var label: String

    /**
     * The **`readyState`** read-only property of the HTMLTrackElement interface returns a number representing the track element's text track readiness state:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`src`** property of the HTMLTrackElement interface reflects the value of the track element's `src` attribute, which indicates the URL of the text track's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src)
     */
    var src: String

    /**
     * The **`srclang`** property of the HTMLTrackElement interface reflects the value of the track element's `srclang` attribute or the empty string if not defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/srclang)
     */
    var srclang: String

    /**
     * The **`track`** read-only property of the HTMLTrackElement interface returns a TextTrack object corresponding to the text track of the track element.
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

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/cuechange_event)
 */
inline val <C : HTMLTrackElement> C.cueChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "cuechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/error_event)
 */
inline val <C : HTMLTrackElement> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/load_event)
 */
inline val <C : HTMLTrackElement> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "load")
