// Automatically generated - do not modify!

package react.dom.events

import dom.Element

external interface AnimationEvent<out T : Element> : SyntheticEvent<T, NativeAnimationEvent> {
    val animationName: String
    val elapsedTime: Double
    val pseudoElement: String
}
