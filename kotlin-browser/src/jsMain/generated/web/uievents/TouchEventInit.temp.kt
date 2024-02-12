// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import js.array.ReadonlyArray
import js.objects.jso

inline fun TouchEventInit(
    block: TouchEventInitMutable.() -> Unit,
): TouchEventInit =
    jso(block)

external interface TouchEventInitMutable :
    TouchEventInit, EventModifierInitMutable {
    override var changedTouches: ReadonlyArray<Touch>?
    override var targetTouches: ReadonlyArray<Touch>?
    override var touches: ReadonlyArray<Touch>?
}
