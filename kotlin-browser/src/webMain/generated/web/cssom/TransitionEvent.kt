// Automatically generated - do not modify!

package web.cssom

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
     * The **`TransitionEvent.elapsedTime`** read-only property is a float giving the amount of time the animation has been running, in seconds, when this event fired. This value is not affected by the transition-delay property.
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
     * The **`TransitionEvent.pseudoElement`** read-only property is a string, starting with '::', containing the name of the pseudo-element the animation runs on. If the transition doesn't run on a pseudo-element but on the element, an empty string: "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/pseudoElement)
     */
    val pseudoElement: String

    companion object
}

inline val TransitionEvent.Companion.TRANSITION_CANCEL: EventType<TransitionEvent>
    get() = EventType("transitioncancel")

inline val TransitionEvent.Companion.TRANSITION_END: EventType<TransitionEvent>
    get() = EventType("transitionend")

inline val TransitionEvent.Companion.TRANSITION_RUN: EventType<TransitionEvent>
    get() = EventType("transitionrun")

inline val TransitionEvent.Companion.TRANSITION_START: EventType<TransitionEvent>
    get() = EventType("transitionstart")
