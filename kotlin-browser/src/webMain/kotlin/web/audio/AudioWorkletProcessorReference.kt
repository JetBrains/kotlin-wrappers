package web.audio

import js.array.ReadonlyArray
import js.reflect.JsClass
import js.reflect.unsafeCast

open class AudioWorkletProcessorReference
protected constructor(
    val value: JsClass<out AudioWorkletProcessor>,
    parameterDescriptors: ReadonlyArray<AudioParamDescriptor>? = null,
) {
    init {
        val static = unsafeCast<AudioWorkletProcessorStatic>(value)

        if (parameterDescriptors != null) {
            static.parameterDescriptors = parameterDescriptors
        }
    }
}
