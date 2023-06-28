// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import web.events.EventHandler

/**
 * An AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext)
 */
external class OfflineAudioContext(
    contextOptions: OfflineAudioContextOptions,
) : BaseAudioContext {
    constructor(
        numberOfChannels: Number,
        length: Number,
        sampleRate: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/length) */
    val length: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event) */
    var oncomplete: EventHandler<OfflineAudioCompletionEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume) */
    fun resume(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering) */
    fun startRendering(): Promise<AudioBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend) */
    fun suspend(suspendTime: Number): Promise<Void>
}
