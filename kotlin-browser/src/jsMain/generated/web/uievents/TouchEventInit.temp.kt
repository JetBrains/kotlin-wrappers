// Automatically generated - do not modify!

package web.uievents

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.jso

inline fun TouchEventInit(
    block: TouchEventInitMutable.() -> Unit,
): TouchEventInit =
    jso(block)

@JsPlainObject
external interface TouchEventInitMutable :
    TouchEventInit,
    EventModifierInitMutable {
    override var changedTouches: ReadonlyArray<Touch>?
    override var targetTouches: ReadonlyArray<Touch>?
    override var touches: ReadonlyArray<Touch>?
}
