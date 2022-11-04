// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import web.events.Event
import web.events.EventInit

external interface AnimationPlaybackEventInit : EventInit {
    var currentTime: CSSNumberish?
    var timelineTime: CSSNumberish?
}

sealed external class AnimationPlaybackEvent : Event {
    companion object
}
