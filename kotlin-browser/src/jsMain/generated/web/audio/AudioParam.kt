// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.typedarrays.Float32Array

/**
 * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
 */
external class AudioParam
private constructor() {
    var automationRate: AutomationRate

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue)
     */
    val defaultValue: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue)
     */
    val maxValue: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue)
     */
    val minValue: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/value)
     */
    var value: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelAndHoldAtTime)
     */
    fun cancelAndHoldAtTime(cancelTime: Double): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelScheduledValues)
     */
    fun cancelScheduledValues(cancelTime: Double): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/exponentialRampToValueAtTime)
     */
    fun exponentialRampToValueAtTime(
        value: Float,
        endTime: Double,
    ): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/linearRampToValueAtTime)
     */
    fun linearRampToValueAtTime(
        value: Float,
        endTime: Double,
    ): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setTargetAtTime)
     */
    fun setTargetAtTime(
        target: Float,
        startTime: Double,
        timeConstant: Float,
    ): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueAtTime)
     */
    fun setValueAtTime(
        value: Float,
        startTime: Double,
    ): AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime)
     */
    fun setValueCurveAtTime(
        values: ReadonlyArray<Double>,
        startTime: Double,
        duration: Double,
    ): AudioParam

    fun setValueCurveAtTime(
        values: Float32Array,
        startTime: Double,
        duration: Double,
    ): AudioParam
}
