// Automatically generated - do not modify!

package web.audio

import js.core.ReadonlyArray
import js.core.Record

sealed external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    var numberOfInputs: Int?
    var numberOfOutputs: Int?
    var outputChannelCount: ReadonlyArray<Number>?
    var parameterData: Record<String, Double>?
    var processorOptions: Any?
}
