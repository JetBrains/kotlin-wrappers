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

    val length: Int
    var oncomplete: EventHandler<OfflineAudioCompletionEvent>?
    fun resume(): Promise<Void>
    fun startRendering(): Promise<AudioBuffer>
    fun suspend(suspendTime: Number): Promise<Void>
}
