// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.events.EventHandler
import web.events.EventInstance
import kotlin.js.JsName

/**
 * The `OfflineAudioContext` interface is an AudioContext interface representing an audio-processing graph built from linked together AudioNodes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext)
 */
open external class OfflineAudioContext(
    contextOptions: OfflineAudioContextOptions,
) : BaseAudioContext {
    constructor(
        numberOfChannels: Int,
        length: Int,
        sampleRate: Float,
    )

    /**
     * The **`length`** property of the the buffer in sample-frames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/length)
     */
    val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
     */
    var oncomplete: EventHandler<OfflineAudioCompletionEvent, OfflineAudioContext, OfflineAudioContext>?

    /**
     * The **`resume()`** method of the context that has been suspended.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
     */
    @JsName("resume")
    fun resumeAsync(): Promise<Void>

    /**
     * The `startRendering()` method of the OfflineAudioContext Interface starts rendering the audio graph, taking into account the current connections and the current scheduled changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
     */
    @JsName("startRendering")
    fun startRenderingAsync(): Promise<AudioBuffer>

    /**
     * The **`suspend()`** method of the OfflineAudioContext interface schedules a suspension of the time progression in the audio context at the specified time and returns a promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
     */
    @JsName("suspend")
    fun suspendAsync(suspendTime: Double): Promise<Void>
}

/**
 * The **`resume()`** method of the context that has been suspended.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
 */
suspend inline fun OfflineAudioContext.resume() {
    awaitPromiseLike(resumeAsync())
}

/**
 * The `startRendering()` method of the OfflineAudioContext Interface starts rendering the audio graph, taking into account the current connections and the current scheduled changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
 */
suspend inline fun OfflineAudioContext.startRendering(): AudioBuffer {
    return awaitPromiseLike(startRenderingAsync())
}

/**
 * The **`suspend()`** method of the OfflineAudioContext interface schedules a suspension of the time progression in the audio context at the specified time and returns a promise.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
 */
suspend inline fun OfflineAudioContext.suspend(suspendTime: Double) {
    awaitPromiseLike(suspendAsync(suspendTime))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
 */
inline val <C : OfflineAudioContext> C.completeEvent: EventInstance<OfflineAudioCompletionEvent, C, C>
    get() = EventInstance(this, "complete")
