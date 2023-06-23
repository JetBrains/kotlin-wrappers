// Automatically generated - do not modify!

package web.audio

/**
 * An AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode)
 */
external class AudioBufferSourceNode(
    context: BaseAudioContext,
    options: AudioBufferSourceOptions = definedExternally,
) : AudioScheduledSourceNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/buffer) */
    var buffer: AudioBuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/detune) */
    val detune: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loop) */
    var loop: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopEnd) */
    var loopEnd: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopStart) */
    var loopStart: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/playbackRate) */
    val playbackRate: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/start) */
    fun start(
        `when`: Number = definedExternally,
        offset: Number = definedExternally,
        duration: Number = definedExternally,
    )
}
