// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<Number>?
    var parameterData: ReadonlyRecord<String, Double>?
    var processorOptions: Any?
}
