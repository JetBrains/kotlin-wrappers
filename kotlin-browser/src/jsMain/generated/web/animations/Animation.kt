// Automatically generated - do not modify!

package web.animations

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation) */
open external class Animation(
    effect: AnimationEffect? = definedExternally,
    timeline: AnimationTimeline? = definedExternally,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/currentTime) */
    var currentTime: CSSNumberish?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/effect) */
    var effect: AnimationEffect?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finished) */
    val finished: Promise<Animation>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/id) */
    var id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event) */
    var oncancel: EventHandler<AnimationPlaybackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event) */
    var onfinish: EventHandler<AnimationPlaybackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event) */
    var onremove: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pending) */
    val pending: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState) */
    val playState: AnimationPlayState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playbackRate) */
    var playbackRate: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/ready) */
    val ready: Promise<Animation>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState) */
    val replaceState: AnimationReplaceState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/startTime) */
    var startTime: CSSNumberish?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/timeline) */
    var timeline: AnimationTimeline?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel) */
    fun cancel()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/commitStyles) */
    fun commitStyles()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish) */
    fun finish()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pause) */
    fun pause()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/persist) */
    fun persist()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/play) */
    fun play()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/reverse) */
    fun reverse()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/updatePlaybackRate) */
    fun updatePlaybackRate(playbackRate: Number)
}
