// Automatically generated - do not modify!

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
