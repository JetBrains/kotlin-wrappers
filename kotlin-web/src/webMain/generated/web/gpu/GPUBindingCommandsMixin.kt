// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gpu

import js.array.ReadonlyArray
import js.reflect.JsExternalInheritorsOnly
import js.typedarrays.Uint32Array
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface GPUBindingCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/setBindGroup)
     */
    fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsets: ReadonlyArray<GPUBufferDynamicOffset> = definedExternally,
    ): Unit = definedExternally

    fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsetsData: Uint32Array<*>,
        dynamicOffsetsDataStart: GPUSize64,
        dynamicOffsetsDataLength: GPUSize32,
    ): Unit = definedExternally
}
