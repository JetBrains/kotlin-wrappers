// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element

external interface TransitionEvent<out T : Element> : SyntheticEvent<T, NativeTransitionEvent<T>> {
    val elapsedTime: Double
    val propertyName: String
    val pseudoElement: String
}
