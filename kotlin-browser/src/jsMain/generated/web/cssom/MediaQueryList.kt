// Automatically generated - do not modify!

package web.cssom

import web.events.EventHandler
import web.events.EventTarget

/**
 * Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList)
 */
sealed external class MediaQueryList :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/matches) */
    val matches: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/media) */
    val media: MediaQuery

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event) */
    var onchange: EventHandler<MediaQueryListEvent>?
}
