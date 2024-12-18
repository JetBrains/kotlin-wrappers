// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array
import js.typedarrays.Uint8Array

/**
 * A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode)
 */
open external class AnalyserNode(
    context: BaseAudioContext,
    options: AnalyserOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/fftSize)
     */
    var fftSize: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/frequencyBinCount)
     */
    val frequencyBinCount: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/maxDecibels)
     */
    var maxDecibels: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/minDecibels)
     */
    var minDecibels: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/smoothingTimeConstant)
     */
    var smoothingTimeConstant: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteFrequencyData)
     */
    fun getByteFrequencyData(array: Uint8Array<*>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteTimeDomainData)
     */
    fun getByteTimeDomainData(array: Uint8Array<*>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatFrequencyData)
     */
    fun getFloatFrequencyData(array: Float32Array<*>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatTimeDomainData)
     */
    fun getFloatTimeDomainData(array: Float32Array<*>)
}
