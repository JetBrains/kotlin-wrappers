// Automatically generated - do not modify!

package web.audio

import kotlinx.js.Float32Array
import kotlinx.js.Uint8Array

external class AnalyserNode(
    context: BaseAudioContext,
    options: AnalyserOptions = definedExternally,
) : AudioNode {
    var fftSize: Number
    val frequencyBinCount: Int
    var maxDecibels: Number
    var minDecibels: Number
    var smoothingTimeConstant: Number
    fun getByteFrequencyData(array: Uint8Array)
    fun getByteTimeDomainData(array: Uint8Array)
    fun getFloatFrequencyData(array: Float32Array)
    fun getFloatTimeDomainData(array: Float32Array)
}
