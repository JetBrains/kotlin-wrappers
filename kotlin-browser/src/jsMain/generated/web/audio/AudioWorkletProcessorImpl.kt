// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.audio

import js.array.ReadonlyArray
import js.objects.Record
import js.typedarrays.Float32Array

external interface AudioWorkletProcessorImpl :
    AudioWorkletProcessor {
    fun process(
        inputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        outputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        parameters: Record<String, Float32Array<*>>,
    ): Boolean
}
