// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`OscillatorNode`** interface represents a periodic waveform, such as a sine wave.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode)
 */
open external class OscillatorNode(
    context: BaseAudioContext,
    options: OscillatorOptions = definedExternally,
) : AudioScheduledSourceNode {
    /**
     * The `detune` property of the OscillatorNode interface is an a-rate AudioParam representing detuning of oscillation in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/detune)
     */
    val detune: AudioParam

    /**
     * The **`frequency`** property of the OscillatorNode interface is an a-rate AudioParam representing the frequency of oscillation in hertz.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/frequency)
     */
    val frequency: AudioParam

    /**
     * The **`type`** property of the OscillatorNode interface specifies what shape of waveform the oscillator will output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type)
     */
    var type: OscillatorType

    /**
     * The **`setPeriodicWave()`** method of the OscillatorNode interface is used to point to a PeriodicWave defining a periodic waveform that can be used to shape the oscillator's output, when ```js-nolint setPeriodicWave(wave) ``` - `wave` - : A PeriodicWave object representing the waveform to use as the shape of the oscillator's output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/setPeriodicWave)
     */
    fun setPeriodicWave(periodicWave: PeriodicWave)
}
