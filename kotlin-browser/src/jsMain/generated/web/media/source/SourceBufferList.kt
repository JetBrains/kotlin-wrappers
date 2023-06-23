// Automatically generated - do not modify!

package web.media.source

import js.core.ArrayLike
import js.core.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * A simple container list for multiple SourceBuffer objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList)
 */
sealed external class SourceBufferList :
    EventTarget,
    ArrayLike<SourceBuffer>,
    JsIterable<SourceBuffer> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/addsourcebuffer_event) */
    var onaddsourcebuffer: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/removesourcebuffer_event) */
    var onremovesourcebuffer: EventHandler<Event>?
}
