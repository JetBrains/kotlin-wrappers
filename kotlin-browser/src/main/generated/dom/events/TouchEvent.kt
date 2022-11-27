// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package dom.events

import js.core.ReadonlyArray

external interface TouchEventInit : EventModifierInit {
    var changedTouches: ReadonlyArray<Touch>?
    var targetTouches: ReadonlyArray<Touch>?
    var touches: ReadonlyArray<Touch>?
}

@JsName("globalThis.TouchEvent")
open external class TouchEvent(
    type: String,
    init: TouchEventInit = definedExternally,
) : UIEvent {
    val altKey: Boolean
    val changedTouches: TouchList
    val ctrlKey: Boolean
    val metaKey: Boolean
    val shiftKey: Boolean
    val targetTouches: TouchList
    val touches: TouchList

    companion object
}
