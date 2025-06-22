// Automatically generated - do not modify!

package web.animations

import js.promise.Promise
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`Animation`** interface of the Web Animations API represents a single animation player and provides playback controls and a timeline for an animation node or source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation)
 */
open external class Animation(
    /**
     * The **`Animation.effect`** property of the Web Animations API gets and sets the target effect of an animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/effect)
     */
    var effect: AnimationEffect? = definedExternally,
    /**
     * The **`Animation.timeline`** property of the Animation interface returns or sets the AnimationTimeline associated with this animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/timeline)
     */
    var timeline: AnimationTimeline? = definedExternally,
) : EventTarget {
    /**
     * The **`Animation.currentTime`** property of the Web Animations API returns and sets the current time value of the animation in milliseconds, whether running or paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/currentTime)
     */
    var currentTime: CSSNumberish?

    /**
     * The **`Animation.finished`** read-only property of the Web Animations API returns a Promise which resolves once the animation has finished playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finished)
     */
    val finished: Promise<Animation>

    /**
     * The **`Animation.id`** property of the Web Animations API returns or sets a string used to identify the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/id)
     */
    var id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event)
     */
    var oncancel: EventHandler<AnimationPlaybackEvent, Animation, Animation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event)
     */
    var onfinish: EventHandler<AnimationPlaybackEvent, Animation, Animation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event)
     */
    var onremove: EventHandler<AnimationPlaybackEvent, Animation, Animation>?

    /**
     * The read-only **`Animation.pending`** property of the Web Animations API indicates whether the animation is currently waiting for an asynchronous operation such as initiating playback or pausing a running animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pending)
     */
    val pending: Boolean

    /**
     * The read-only **`Animation.playState`** property of the Web Animations API returns an enumerated value describing the playback state of an animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState)
     */
    val playState: AnimationPlayState

    /**
     * The **`Animation.playbackRate`** property of the Web Animations API returns or sets the playback rate of the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playbackRate)
     */
    var playbackRate: Double

    /**
     * The read-only **`Animation.ready`** property of the Web Animations API returns a Promise which resolves when the animation is ready to play.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/ready)
     */
    val ready: Promise<Animation>

    /**
     * The read-only **`Animation.replaceState`** property of the Web Animations API indicates whether the animation has been removed by the browser automatically after being replaced by another animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState)
     */
    val replaceState: AnimationReplaceState

    /**
     * The **`Animation.startTime`** property of the Animation interface is a double-precision floating-point value which indicates the scheduled time when an animation's playback should begin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/startTime)
     */
    var startTime: CSSNumberish?

    /**
     * The Web Animations API's **`cancel()`** method of the Animation interface clears all KeyframeEffects caused by this animation and aborts its playback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel)
     */
    fun cancel()

    /**
     * The `commitStyles()` method of the Web Animations API's Animation interface writes the computed values of the animation's current styles into its target element's `style` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/commitStyles)
     */
    fun commitStyles()

    /**
     * The **`finish()`** method of the Web Animations API's Animation Interface sets the current playback time to the end of the animation corresponding to the current playback direction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish)
     */
    fun finish()

    /**
     * The **`pause()`** method of the Web Animations API's Animation interface suspends playback of the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pause)
     */
    fun pause()

    /**
     * The `persist()` method of the Web Animations API's Animation interface explicitly persists an animation, preventing it from being automatically removed when it is replaced by another animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/persist)
     */
    fun persist()

    /**
     * The **`play()`** method of the Web Animations API's Animation Interface starts or resumes playing of an animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/play)
     */
    fun play()

    /**
     * The **`Animation.reverse()`** method of the Animation Interface reverses the playback direction, meaning the animation ends at its beginning.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/reverse)
     */
    fun reverse()

    /**
     * The **`updatePlaybackRate()`** method of the Web Animations API's synchronizing its playback position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/updatePlaybackRate)
     */
    fun updatePlaybackRate(playbackRate: Double)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event)
 */
inline val <C : Animation> C.cancelEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event)
 */
inline val <C : Animation> C.finishEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, "finish")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event)
 */
inline val <C : Animation> C.removeEvent: EventInstance<AnimationPlaybackEvent, C, C>
    get() = EventInstance(this, "remove")
