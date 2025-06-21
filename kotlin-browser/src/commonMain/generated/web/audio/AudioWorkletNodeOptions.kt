// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsDouble
import js.core.JsString
import js.core.JsUInt
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<JsUInt>?
    var parameterData: ReadonlyRecord<JsString, JsDouble>?
    var processorOptions: JsAny?
}
