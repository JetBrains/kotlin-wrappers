// Automatically generated - do not modify!

package web.audio

/**
 * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode)
 */
external class OscillatorNode(
    context: BaseAudioContext,
    options: OscillatorOptions = definedExternally,
) : AudioScheduledSourceNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/detune) */
    val detune: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/frequency) */
    val frequency: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type) */
    var type: OscillatorType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/setPeriodicWave) */
    fun setPeriodicWave(periodicWave: PeriodicWave)
}
