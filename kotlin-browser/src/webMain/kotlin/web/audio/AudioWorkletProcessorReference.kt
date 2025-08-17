package web.audio

import js.array.ReadonlyArray
import js.reflect.JsClass
import js.reflect.JsClassReference
import js.reflect.unsafeCast

open class AudioWorkletProcessorReference<T : AudioWorkletProcessor>
protected constructor(
    override val value: JsClass<T>,
    parameterDescriptors: ReadonlyArray<AudioParamDescriptor>? = null,
) : JsClassReference<T> {
    init {
        val static = unsafeCast<AudioWorkletProcessorStatic>(value)

        if (parameterDescriptors != null) {
            static.parameterDescriptors = parameterDescriptors
        }
    }
}
