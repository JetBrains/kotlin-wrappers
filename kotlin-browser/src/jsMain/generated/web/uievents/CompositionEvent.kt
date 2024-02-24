// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 */
open external class CompositionEvent<out C : EventTarget?>(
    override val type: EventType<CompositionEvent<C>>,
    init: CompositionEventInit = definedExternally,
) : UIEvent<C>,
    CompositionEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data)
     */
    override val data: String

    companion object : CompositionEventTypes
}
