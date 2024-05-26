// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventTarget
import web.events.EventType

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 */
open external class CompositionEvent(
    override val type: EventType<CompositionEvent, EventTarget>,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data)
     */
    val data: String

    @JsAlias(THIS)
    override fun asInit(): CompositionEventInit

    companion object : CompositionEventTypes
}
