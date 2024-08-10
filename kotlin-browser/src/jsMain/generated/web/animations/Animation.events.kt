// Automatically generated - do not modify!

package web.animations

import web.events.EventInstance

inline val <C : Animation> C.cancelEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.cancel())

inline val <C : Animation> C.finishEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.finish())

inline val <C : Animation> C.removeEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.remove())
