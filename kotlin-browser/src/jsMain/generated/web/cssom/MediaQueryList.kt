// Automatically generated - do not modify!

package web.cssom

import web.events.EventHandler
import web.events.EventTarget

sealed external class MediaQueryList :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/matches) */
    val matches: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/media) */
    val media: MediaQuery

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event) */
    var onchange: EventHandler<MediaQueryListEvent>?
}
