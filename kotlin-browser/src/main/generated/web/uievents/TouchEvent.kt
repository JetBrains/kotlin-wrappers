// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package web.uievents

import js.core.ReadonlyArray
import web.events.EventType

external interface TouchEventInit : EventModifierInit {
    var changedTouches: ReadonlyArray<Touch>?
    var targetTouches: ReadonlyArray<Touch>?
    var touches: ReadonlyArray<Touch>?
}

@JsName("globalThis.TouchEvent")
open external class TouchEvent(
    override val type: EventType<TouchEvent>,
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
