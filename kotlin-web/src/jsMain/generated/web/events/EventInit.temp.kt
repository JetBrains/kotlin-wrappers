// Automatically generated - do not modify!

package web.events

import js.objects.jso

inline fun EventInit(
    block: EventInitMutable.() -> Unit,
): EventInit =
    jso(block)

external interface EventInitMutable :
    EventInit {
    override var bubbles: Boolean?
    override var cancelable: Boolean?
    override var composed: Boolean?
}
