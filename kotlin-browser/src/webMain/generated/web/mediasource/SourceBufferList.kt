// Automatically generated - do not modify!

package web.mediasource

import js.array.ArrayLike
import js.iterable.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`SourceBufferList`** interface represents a simple container list for multiple SourceBuffer objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList)
 */
open external class SourceBufferList
private constructor() :
    EventTarget,
    ArrayLike<SourceBuffer>,
    JsIterable<SourceBuffer> {
    /**
     * The **`length`** read-only property of the SourceBufferList interface returns the number of SourceBuffer objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/length)
     */
    override val length: Int
    var onaddsourcebuffer: EventHandler<Event, SourceBufferList, SourceBufferList>?
    var onremovesourcebuffer: EventHandler<Event, SourceBufferList, SourceBufferList>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/addsourcebuffer_event)
 */
inline val <C : SourceBufferList> C.addSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "addsourcebuffer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/removesourcebuffer_event)
 */
inline val <C : SourceBufferList> C.removeSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "removesourcebuffer")
