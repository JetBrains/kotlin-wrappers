// Automatically generated - do not modify!

package web.audio

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
