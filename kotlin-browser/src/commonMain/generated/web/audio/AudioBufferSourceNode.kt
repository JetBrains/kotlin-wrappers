// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`AudioBufferSourceNode`** interface is an AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode)
 */
open external class AudioBufferSourceNode(
    context: BaseAudioContext,
    options: AudioBufferSourceOptions = definedExternally,
) : AudioScheduledSourceNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/buffer)
     */
    var buffer: AudioBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/detune)
     */
    val detune: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loop)
     */
    var loop: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopEnd)
     */
    var loopEnd: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopStart)
     */
    var loopStart: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/playbackRate)
     */
    val playbackRate: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/start)
     */
    fun start(
        `when`: Double = definedExternally,
        offset: Double = definedExternally,
        duration: Double = definedExternally,
    )
}
