// Automatically generated - do not modify!

package web.audio

import js.core.ReadonlyArray
import js.typedarrays.Float32Array

/**
 * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
 */
sealed external class AudioParam {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/automationRate) */
    var automationRate: AutomationRate

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue) */
    val defaultValue: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue) */
    val maxValue: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue) */
    val minValue: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/value) */
    var value: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelAndHoldAtTime) */
    fun cancelAndHoldAtTime(cancelTime: Number): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelScheduledValues) */
    fun cancelScheduledValues(cancelTime: Number): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/exponentialRampToValueAtTime) */
    fun exponentialRampToValueAtTime(
        value: Number,
        endTime: Number,
    ): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/linearRampToValueAtTime) */
    fun linearRampToValueAtTime(
        value: Number,
        endTime: Number,
    ): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setTargetAtTime) */
    fun setTargetAtTime(
        target: Number,
        startTime: Number,
        timeConstant: Number,
    ): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueAtTime) */
    fun setValueAtTime(
        value: Number,
        startTime: Number,
    ): AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime) */
    fun setValueCurveAtTime(
        values: ReadonlyArray<Double>,
        startTime: Number,
        duration: Number,
    ): AudioParam

    fun setValueCurveAtTime(
        values: Float32Array,
        startTime: Number,
        duration: Number,
    ): AudioParam
}
