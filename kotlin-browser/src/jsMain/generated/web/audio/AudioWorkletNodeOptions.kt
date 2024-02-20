// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
sealed external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<Number>?
    var parameterData: ReadonlyRecord<String, Double>?
    var processorOptions: Any?
}
