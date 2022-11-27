// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array
import js.typedarrays.Uint8Array

external class AnalyserNode(
    context: BaseAudioContext,
    options: AnalyserOptions = definedExternally,
) : AudioNode {
    var fftSize: Int
    val frequencyBinCount: Int
    var maxDecibels: Double
    var minDecibels: Double
    var smoothingTimeConstant: Double
    fun getByteFrequencyData(array: Uint8Array)
    fun getByteTimeDomainData(array: Uint8Array)
    fun getFloatFrequencyData(array: Float32Array)
    fun getFloatTimeDomainData(array: Float32Array)
}
