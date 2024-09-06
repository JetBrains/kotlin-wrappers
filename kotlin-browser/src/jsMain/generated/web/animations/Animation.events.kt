// Automatically generated - do not modify!

package web.animations

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event)
 */
inline val <C : Animation> C.cancelEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event)
 */
inline val <C : Animation> C.finishEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.FINISH)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event)
 */
inline val <C : Animation> C.removeEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, AnimationPlaybackEvent.REMOVE)
