// Automatically generated - do not modify!

package web.animations

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface AnimationEventInit : EventInit {
    var animationName: String?
    var elapsedTime: Double?
    var pseudoElement: String?
}

open external class AnimationEvent(
    type: EventType<AnimationEvent>,
    init: AnimationEventInit = definedExternally,
) : Event {
    val animationName: String
    val elapsedTime: Double
    val pseudoElement: String

    companion object
}
