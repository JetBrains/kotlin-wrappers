// Automatically generated - do not modify!

package web.audio

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
