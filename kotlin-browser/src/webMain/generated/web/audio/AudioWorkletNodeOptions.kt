// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.numbers.JsDouble
import js.numbers.JsUInt
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny
import kotlin.js.JsString

@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<JsUInt>?
    var parameterData: ReadonlyRecord<JsString, JsDouble>?
    var processorOptions: JsAny?
}
