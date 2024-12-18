// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    val numberOfInputs: Int?
    val numberOfOutputs: Int?
    val outputChannelCount: ReadonlyArray<Number>?
    val parameterData: ReadonlyRecord<String, Double>?
    val processorOptions: Any?
}
