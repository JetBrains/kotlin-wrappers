// Automatically generated - do not modify!

package web.audio

import kotlinx.js.ReadonlyArray

sealed external class AudioParam {
    var automationRate: AutomationRate
    val defaultValue: Double
    val maxValue: Double
    val minValue: Double
    var value: Double
    fun cancelAndHoldAtTime(cancelTime: Number): AudioParam
    fun cancelScheduledValues(cancelTime: Number): AudioParam
    fun exponentialRampToValueAtTime(
        value: Number,
        endTime: Number,
    ): AudioParam

    fun linearRampToValueAtTime(
        value: Number,
        endTime: Number,
    ): AudioParam

    fun setTargetAtTime(
        target: Number,
        startTime: Number,
        timeConstant: Number,
    ): AudioParam

    fun setValueAtTime(
        value: Number,
        startTime: Number,
    ): AudioParam

    fun setValueCurveAtTime(
        values: ReadonlyArray<Double>, /* | Float32Array */
        startTime: Number,
        duration: Number,
    ): AudioParam
}
