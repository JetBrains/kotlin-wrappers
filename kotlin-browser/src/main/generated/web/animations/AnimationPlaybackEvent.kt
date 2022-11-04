// Automatically generated - do not modify!

package web.animations

import web.events.Event
import web.events.EventInit

external interface AnimationPlaybackEventInit : EventInit {
    var currentTime: CSSNumberish?
    var timelineTime: CSSNumberish?
}

open external class AnimationPlaybackEvent(
    type: String,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event {
    val currentTime: CSSNumberish?
    val timelineTime: CSSNumberish?

    companion object
}
