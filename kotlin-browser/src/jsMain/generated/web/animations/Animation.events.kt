// Automatically generated - do not modify!

package web.animations

import web.events.EventInstance
import web.events.EventType

inline val <C : Animation> C.cancelEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, EventType("cancel"))

inline val <C : Animation> C.finishEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, EventType("finish"))

inline val <C : Animation> C.removeEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, EventType("remove"))
