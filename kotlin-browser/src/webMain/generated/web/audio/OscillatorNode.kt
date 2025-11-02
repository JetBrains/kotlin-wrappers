// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`OscillatorNode`** interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode)
 */
open external class OscillatorNode(
    context: BaseAudioContext,
    options: OscillatorOptions = definedExternally,
) : AudioScheduledSourceNode {
    /**
     * The **`detune`** property of the OscillatorNode interface is an a-rate AudioParam representing detuning of oscillation in cents.
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
     * The **`type`** property of the OscillatorNode interface specifies what shape of waveform the oscillator will output. There are several common waveforms available, as well as an option to specify a custom waveform shape. The shape of the waveform will affect the tone that is produced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type)
     */
    var type: OscillatorType

    /**
     * The **`setPeriodicWave()`** method of the OscillatorNode interface is used to point to a PeriodicWave defining a periodic waveform that can be used to shape the oscillator's output, when type is custom.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/setPeriodicWave)
     */
    fun setPeriodicWave(periodicWave: PeriodicWave)
}
