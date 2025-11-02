// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.core.JsDouble
import js.typedarrays.Float32Array

/**
 * The Web Audio API's **`AudioParam`** interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
 */
open external class AudioParam
private constructor() {
    var automationRate: AutomationRate

    /**
     * The **`defaultValue`** read-only property of the AudioParam interface represents the initial value of the attributes as defined by the specific AudioNode creating the AudioParam.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue)
     */
    val defaultValue: Float

    /**
     * The **`maxValue`** read-only property of the AudioParam interface represents the maximum possible value for the parameter's nominal (effective) range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue)
     */
    val maxValue: Float

    /**
     * The **`minValue`** read-only property of the AudioParam interface represents the minimum possible value for the parameter's nominal (effective) range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue)
     */
    val minValue: Float

    /**
     * The **`value`** property of the AudioParam interface gets or sets the value of this AudioParam at the current time. Initially, the value is set to AudioParam.defaultValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/value)
     */
    var value: Float

    /**
     * The **`cancelAndHoldAtTime()`** method of the AudioParam interface cancels all scheduled future changes to the AudioParam but holds its value at a given time until further changes are made using other methods.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelAndHoldAtTime)
     */
    fun cancelAndHoldAtTime(cancelTime: Double): AudioParam

    /**
     * The **`cancelScheduledValues()`** method of the AudioParam Interface cancels all scheduled future changes to the AudioParam.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelScheduledValues)
     */
    fun cancelScheduledValues(cancelTime: Double): AudioParam

    /**
     * The **`exponentialRampToValueAtTime()`** method of the AudioParam Interface schedules a gradual exponential change in the value of the AudioParam. The change starts at the time specified for the previous event, follows an exponential ramp to the new value given in the value parameter, and reaches the new value at the time given in the endTime parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/exponentialRampToValueAtTime)
     */
    fun exponentialRampToValueAtTime(
        value: Float,
        endTime: Double,
    ): AudioParam

    /**
     * The **`linearRampToValueAtTime()`** method of the AudioParam Interface schedules a gradual linear change in the value of the AudioParam. The change starts at the time specified for the previous event, follows a linear ramp to the new value given in the value parameter, and reaches the new value at the time given in the endTime parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/linearRampToValueAtTime)
     */
    fun linearRampToValueAtTime(
        value: Float,
        endTime: Double,
    ): AudioParam

    /**
     * The **`setTargetAtTime()`** method of the AudioParam interface schedules the start of a gradual change to the AudioParam value. This is useful for decay or release portions of ADSR envelopes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setTargetAtTime)
     */
    fun setTargetAtTime(
        target: Float,
        startTime: Double,
        timeConstant: Float,
    ): AudioParam

    /**
     * The **`setValueAtTime()`** method of the AudioParam interface schedules an instant change to the AudioParam value at a precise time, as measured against AudioContext.currentTime. The new value is given in the value parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueAtTime)
     */
    fun setValueAtTime(
        value: Float,
        startTime: Double,
    ): AudioParam

    /**
     * The **`setValueCurveAtTime()`** method of the AudioParam interface schedules the parameter's value to change following a curve defined by a list of values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime)
     */
    fun setValueCurveAtTime(
        values: ReadonlyArray<JsDouble>,
        startTime: Double,
        duration: Double,
    ): AudioParam

    fun setValueCurveAtTime(
        values: Float32Array<*>,
        startTime: Double,
        duration: Double,
    ): AudioParam
}
