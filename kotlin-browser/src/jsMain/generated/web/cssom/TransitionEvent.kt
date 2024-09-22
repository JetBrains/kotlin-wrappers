// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * Events providing information related to transitions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
 */
open external class TransitionEvent(
    override val type: EventType<TransitionEvent>,
    init: TransitionEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/elapsedTime)
     */
    val elapsedTime: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/propertyName)
     */
    val propertyName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/pseudoElement)
     */
    val pseudoElement: String

    @JsAlias(THIS)
    override fun asInit(): TransitionEventInit

    companion object {
        @JsValue("transitioncancel")
        val TRANSITION_CANCEL: EventType<TransitionEvent>

        @JsValue("transitionend")
        val TRANSITION_END: EventType<TransitionEvent>

        @JsValue("transitionrun")
        val TRANSITION_RUN: EventType<TransitionEvent>

        @JsValue("transitionstart")
        val TRANSITION_START: EventType<TransitionEvent>
    }
}
