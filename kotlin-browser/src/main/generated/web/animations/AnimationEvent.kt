// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import web.events.Event
import web.events.EventInit

external interface AnimationEventInit : EventInit {
    var animationName: String?
    var elapsedTime: Double?
    var pseudoElement: String?
}

open external class AnimationEvent(
    type: String,
    init: AnimationEventInit = definedExternally,
) : Event {
    val animationName: String
    val elapsedTime: Double
    val pseudoElement: String

    companion object
}
