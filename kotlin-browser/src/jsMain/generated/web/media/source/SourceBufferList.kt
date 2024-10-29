// Automatically generated - do not modify!

package web.media.source

import js.array.ArrayLike
import js.iterable.JsIterable
import web.events.*

/**
 * A simple container list for multiple SourceBuffer objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList)
 */
sealed external class SourceBufferList :
    EventTarget,
    ArrayLike<SourceBuffer>,
    JsIterable<SourceBuffer> {
    var onaddsourcebuffer: EventHandler<Event, SourceBufferList, SourceBufferList>?
    var onremovesourcebuffer: EventHandler<Event, SourceBufferList, SourceBufferList>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/addsourcebuffer_event)
     */
    @JsEvent("addsourcebuffer")
    val addSourceBufferEvent: EventInstance<Event, SourceBufferList /* this */, SourceBufferList /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/removesourcebuffer_event)
     */
    @JsEvent("removesourcebuffer")
    val removeSourceBufferEvent: EventInstance<Event, SourceBufferList /* this */, SourceBufferList /* this */>
}
