// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element

external interface AnimationEvent<out T : Element> : SyntheticEvent<T, NativeAnimationEvent<T>> {
    val animationName: String
    val elapsedTime: Double
    val pseudoElement: String
}
