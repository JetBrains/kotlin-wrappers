// Automatically generated - do not modify!

package web.audio

import js.core.JsLong
import web.worklets.WorkletGlobalScope

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope)
 */
sealed external class AudioWorkletGlobalScope :
    WorkletGlobalScope {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentFrame)
     */
    val currentFrame: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentTime)
     */
    val currentTime: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/sampleRate)
     */
    val sampleRate: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/registerProcessor)
     */
    fun registerProcessor(
        name: String,
        processorCtor: AudioWorkletProcessorConstructor,
    )
}
