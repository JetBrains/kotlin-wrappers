// Automatically generated - do not modify!

package web.cssom

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * A **`MediaQueryList`** object stores information on a media query applied to a document, with support for both immediate and event-driven matching against the state of the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList)
 */
external class MediaQueryList
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/matches)
     */
    val matches: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/media)
     */
    val media: MediaQuery

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event)
     */
    var onchange: EventHandler<MediaQueryListEvent, MediaQueryList, MediaQueryList>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<MediaQueryListEvent, MediaQueryList /* this */, MediaQueryList /* this */>
}
