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
external class SourceBufferList
private constructor() :
    EventTarget,
    ArrayLike<SourceBuffer>,
    JsIterable<SourceBuffer> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/length)
     */
    override val length: Int
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
