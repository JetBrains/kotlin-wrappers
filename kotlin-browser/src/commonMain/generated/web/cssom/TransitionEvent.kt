// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`TransitionEvent`** interface represents events providing information related to transitions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
 */
open external class TransitionEvent(
    override val type: EventType<TransitionEvent>,
    init: TransitionEventInit = definedExternally,
) : Event {
    /**
     * The **`TransitionEvent.elapsedTime`** read-only property is a `float` giving the amount of time the animation has been running, in seconds, when this event fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/elapsedTime)
     */
    val elapsedTime: Double

    /**
     * The **`propertyName`** read-only property of TransitionEvent objects is a string containing the name of the CSS property associated with the transition.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/propertyName)
     */
    val propertyName: String

    /**
     * The **`TransitionEvent.pseudoElement`** read-only property is a string, starting with `'::'`, containing the name of the pseudo-element the animation runs on.
     *
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
