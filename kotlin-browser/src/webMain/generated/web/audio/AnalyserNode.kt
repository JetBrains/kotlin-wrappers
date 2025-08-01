// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array
import js.typedarrays.Uint8Array
import kotlin.js.definedExternally

/**
 * The **`AnalyserNode`** interface represents a node able to provide real-time frequency and time-domain analysis information.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode)
 */
open external class AnalyserNode(
    context: BaseAudioContext,
    options: AnalyserOptions = definedExternally,
) : AudioNode {
    /**
     * The **`fftSize`** property of the AnalyserNode interface is an unsigned long value and represents the window size in samples that is used when performing a Fast Fourier Transform (FFT) to get frequency domain data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/fftSize)
     */
    var fftSize: Int

    /**
     * The **`frequencyBinCount`** read-only property of the AnalyserNode interface contains the total number of data points available to AudioContext BaseAudioContext.sampleRate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/frequencyBinCount)
     */
    val frequencyBinCount: Int

    /**
     * The **`maxDecibels`** property of the AnalyserNode interface is a double value representing the maximum power value in the scaling range for the FFT analysis data, for conversion to unsigned byte values — basically, this specifies the maximum value for the range of results when using `getByteFrequencyData()`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/maxDecibels)
     */
    var maxDecibels: Double

    /**
     * The **`minDecibels`** property of the AnalyserNode interface is a double value representing the minimum power value in the scaling range for the FFT analysis data, for conversion to unsigned byte values — basically, this specifies the minimum value for the range of results when using `getByteFrequencyData()`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/minDecibels)
     */
    var minDecibels: Double

    /**
     * The **`smoothingTimeConstant`** property of the AnalyserNode interface is a double value representing the averaging constant with the last analysis frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/smoothingTimeConstant)
     */
    var smoothingTimeConstant: Double

    /**
     * The **`getByteFrequencyData()`** method of the AnalyserNode interface copies the current frequency data into a Uint8Array (unsigned byte array) passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteFrequencyData)
     */
    fun getByteFrequencyData(array: Uint8Array<ArrayBuffer>)

    /**
     * The **`getByteTimeDomainData()`** method of the AnalyserNode Interface copies the current waveform, or time-domain, data into a Uint8Array (unsigned byte array) passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteTimeDomainData)
     */
    fun getByteTimeDomainData(array: Uint8Array<ArrayBuffer>)

    /**
     * The **`getFloatFrequencyData()`** method of the AnalyserNode Interface copies the current frequency data into a Float32Array array passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatFrequencyData)
     */
    fun getFloatFrequencyData(array: Float32Array<ArrayBuffer>)

    /**
     * The **`getFloatTimeDomainData()`** method of the AnalyserNode Interface copies the current waveform, or time-domain, data into a Float32Array array passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatTimeDomainData)
     */
    fun getFloatTimeDomainData(array: Float32Array<ArrayBuffer>)
}
