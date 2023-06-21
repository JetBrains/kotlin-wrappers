// Automatically generated - do not modify!

package web.audio

import js.core.Void
import web.events.EventHandler
import kotlin.js.Promise

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
