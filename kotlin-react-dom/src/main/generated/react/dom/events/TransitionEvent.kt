// Automatically generated - do not modify!

package react.dom.events

import org.w3c.dom.Element

external interface TransitionEvent<T : Element> : SyntheticEvent<T, NativeTransitionEvent> {
    val elapsedTime: Double
    val propertyName: String
    val pseudoElement: String
}
