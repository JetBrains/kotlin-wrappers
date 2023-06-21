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
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey) */
    val altKey: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches) */
    val changedTouches: TouchList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey) */
    val ctrlKey: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey) */
    val metaKey: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey) */
    val shiftKey: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches) */
    val targetTouches: TouchList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches) */
    val touches: TouchList

    companion object
}
