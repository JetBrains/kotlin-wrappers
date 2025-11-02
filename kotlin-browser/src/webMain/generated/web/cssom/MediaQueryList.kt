// Automatically generated - do not modify!

package web.cssom

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * A **`MediaQueryList`** object stores information on a media query applied to a document, with support for both immediate and event-driven matching against the state of the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList)
 */
open external class MediaQueryList
private constructor() :
    EventTarget {
    /**
     * The **`matches`** read-only property of the MediaQueryList interface is a boolean value that returns true if the document currently matches the media query list, or false if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/matches)
     */
    val matches: Boolean

    /**
     * The **`media`** read-only property of the MediaQueryList interface is a string representing a serialized media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/media)
     */
    val media: MediaQuery

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event)
     */
    var onchange: EventHandler<MediaQueryListEvent, MediaQueryList, MediaQueryList>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event)
 */
inline val <C : MediaQueryList> C.changeEvent: EventInstance<MediaQueryListEvent, C, C>
    get() = EventInstance(this, "change")
