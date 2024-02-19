// Automatically generated - do not modify!

package web.events

import js.objects.JsPlainObject
import js.objects.jso

inline fun EventInit(
    block: EventInitMutable.() -> Unit,
): EventInit =
    jso(block)

@JsPlainObject
external interface EventInitMutable :
    EventInit {
    override var bubbles: Boolean?
    override var cancelable: Boolean?
    override var composed: Boolean?
}
