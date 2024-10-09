// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    val numberOfInputs: Int?
    val numberOfOutputs: Int?
    val outputChannelCount: ReadonlyArray<Number>?
    val parameterData: ReadonlyRecord<String, Double>?
    val processorOptions: Any?
}
