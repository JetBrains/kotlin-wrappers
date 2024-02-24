// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

/**
 * Focus-related events like focus, blur, focusin, or focusout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
open external class FocusEvent<out C : EventTarget?>(
    override val type: EventType<FocusEvent<C>>,
    init: FocusEventInit = definedExternally,
) : UIEvent<C>,
    FocusEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
     */
    override val relatedTarget: EventTarget?

    companion object : FocusEventTypes
}
