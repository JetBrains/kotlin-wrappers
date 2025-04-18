// Automatically generated - do not modify!

package web.animations

import js.promise.Promise
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.definedExternally

/**
 * The **`Animation`** interface of the Web Animations API represents a single animation player and provides playback controls and a timeline for an animation node or source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation)
 */
open external class Animation(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/effect)
     */
    var effect: AnimationEffect? = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/timeline)
     */
    var timeline: AnimationTimeline? = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/currentTime)
     */
    var currentTime: CSSNumberish?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finished)
     */
    val finished: Promise<Animation>

    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pending)
     */
    val pending: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState)
     */
    val playState: AnimationPlayState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playbackRate)
     */
    var playbackRate: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/ready)
     */
    val ready: Promise<Animation>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState)
     */
    val replaceState: AnimationReplaceState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/startTime)
     */
    var startTime: CSSNumberish?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel)
     */
    fun cancel()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/commitStyles)
     */
    fun commitStyles()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish)
     */
    fun finish()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pause)
     */
    fun pause()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/persist)
     */
    fun persist()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/play)
     */
    fun play()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/reverse)
     */
    fun reverse()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/updatePlaybackRate)
     */
    fun updatePlaybackRate(playbackRate: Double)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event)
     */
    @JsEvent("cancel")
    val cancelEvent: EventInstance<AnimationPlaybackEvent, Animation /* this */, Animation /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event)
     */
    @JsEvent("finish")
    val finishEvent: EventInstance<AnimationPlaybackEvent, Animation /* this */, Animation /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event)
     */
    @JsEvent("remove")
    val removeEvent: EventInstance<AnimationPlaybackEvent, Animation /* this */, Animation /* this */>
}
