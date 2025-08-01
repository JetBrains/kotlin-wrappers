// Automatically generated - do not modify!

package web.focus

import js.reflect.unsafeCast
import web.events.EventTarget
import web.events.EventType
import web.uievents.UIEvent
import kotlin.js.definedExternally

/**
 * The **`FocusEvent`** interface represents focus-related events, including Element/focus_event, Element/blur_event, Element/focusin_event, and Element/focusout_event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
open external class FocusEvent(
    override val type: EventType<FocusEvent>,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    /**
     * The **`relatedTarget`** read-only property of the FocusEvent interface is the secondary target, depending on the type of event:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
     */
    val relatedTarget: EventTarget?

    companion object
}

inline fun FocusEvent.asInit(): FocusEventInit =
    unsafeCast(this)

inline val FocusEvent.Companion.BLUR: EventType<FocusEvent>
    get() = EventType("blur")

inline val FocusEvent.Companion.FOCUS: EventType<FocusEvent>
    get() = EventType("focus")

inline val FocusEvent.Companion.FOCUS_IN: EventType<FocusEvent>
    get() = EventType("focusin")

inline val FocusEvent.Companion.FOCUS_OUT: EventType<FocusEvent>
    get() = EventType("focusout")
