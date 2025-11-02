// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import kotlin.js.JsName

/**
 * The **`OfflineAudioContext`** interface is an AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer.
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
     * The **`length`** property of the OfflineAudioContext interface returns an integer representing the size of the buffer in sample-frames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/length)
     */
    val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
     */
    var oncomplete: EventHandler<OfflineAudioCompletionEvent, OfflineAudioContext, OfflineAudioContext>?

    /**
     * The **`resume()`** method of the OfflineAudioContext interface resumes the progression of time in an audio context that has been suspended. The promise resolves immediately because the OfflineAudioContext does not require the audio hardware.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
     */
    @JsName("resume")
    fun resumeAsync(): Promise<Void>

    /**
     * The **`startRendering()`** method of the OfflineAudioContext Interface starts rendering the audio graph, taking into account the current connections and the current scheduled changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
     */
    @JsName("startRendering")
    fun startRenderingAsync(): Promise<AudioBuffer>

    /**
     * The **`suspend()`** method of the OfflineAudioContext interface schedules a suspension of the time progression in the audio context at the specified time and returns a promise. This is generally useful at the time of manipulating the audio graph synchronously on OfflineAudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
     */
    @JsName("suspend")
    fun suspendAsync(suspendTime: Double): Promise<Void>
}

/**
 * The **`resume()`** method of the OfflineAudioContext interface resumes the progression of time in an audio context that has been suspended. The promise resolves immediately because the OfflineAudioContext does not require the audio hardware.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
 */
suspend inline fun OfflineAudioContext.resume() {
    resumeAsync().await()
}

/**
 * The **`startRendering()`** method of the OfflineAudioContext Interface starts rendering the audio graph, taking into account the current connections and the current scheduled changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
 */
suspend inline fun OfflineAudioContext.startRendering(): AudioBuffer {
    return startRenderingAsync().await()
}

/**
 * The **`suspend()`** method of the OfflineAudioContext interface schedules a suspension of the time progression in the audio context at the specified time and returns a promise. This is generally useful at the time of manipulating the audio graph synchronously on OfflineAudioContext.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
 */
suspend inline fun OfflineAudioContext.suspend(suspendTime: Double) {
    suspendAsync(
        suspendTime = suspendTime,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
 */
inline val <C : OfflineAudioContext> C.completeEvent: EventInstance<OfflineAudioCompletionEvent, C, C>
    get() = EventInstance(this, "complete")
