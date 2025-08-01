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
     * The **`buffer`** property of the AudioBufferSourceNode interface provides the ability to play back audio using an AudioBuffer as the source of the sound data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/buffer)
     */
    var buffer: AudioBuffer?

    /**
     * The **`detune`** property of the AudioBufferSourceNode interface is a k-rate AudioParam representing detuning of oscillation in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/detune)
     */
    val detune: AudioParam

    /**
     * The `loop` property of the AudioBufferSourceNode interface is a Boolean indicating if the audio asset must be replayed when the end of the AudioBuffer is reached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loop)
     */
    var loop: Boolean

    /**
     * The `loopEnd` property of the AudioBufferSourceNode interface specifies is a floating point number specifying, in seconds, at what offset into playing the AudioBuffer playback should loop back to the time indicated by the AudioBufferSourceNode.loopStart property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopEnd)
     */
    var loopEnd: Double

    /**
     * The **`loopStart`** property of the AudioBufferSourceNode interface is a floating-point value indicating, in seconds, where in the AudioBuffer the restart of the play must happen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopStart)
     */
    var loopStart: Double

    /**
     * The **`playbackRate`** property of the AudioBufferSourceNode interface Is a k-rate AudioParam that defines the speed at which the audio asset will be played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/playbackRate)
     */
    val playbackRate: AudioParam

    /**
     * The `start()` method of the AudioBufferSourceNode Interface is used to schedule playback of the audio data contained in the buffer, or to begin playback immediately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/start)
     */
    fun start(
        `when`: Double = definedExternally,
        offset: Double = definedExternally,
        duration: Double = definedExternally,
    )
}
