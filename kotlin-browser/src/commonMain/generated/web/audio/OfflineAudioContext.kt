// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/length)
     */
    val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
     */
    var oncomplete: EventHandler<OfflineAudioCompletionEvent, OfflineAudioContext, OfflineAudioContext>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun resume()

    @JsName("resume")
    fun resumeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun startRendering(): AudioBuffer

    @JsName("startRendering")
    fun startRenderingAsync(): Promise<AudioBuffer>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun suspend(suspendTime: Double)

    @JsName("suspend")
    fun suspendAsync(suspendTime: Double): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
     */
    @JsEvent("complete")
    val completeEvent: EventInstance<OfflineAudioCompletionEvent, OfflineAudioContext /* this */, OfflineAudioContext /* this */>
}
