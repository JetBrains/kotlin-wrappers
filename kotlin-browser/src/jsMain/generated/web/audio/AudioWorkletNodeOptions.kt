// Automatically generated - do not modify!

package web.audio

import js.core.ReadonlyArray
import js.core.ReadonlyRecord

sealed external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<Number>?
    var parameterData: ReadonlyRecord<String, Double>?
    var processorOptions: Any?
}
