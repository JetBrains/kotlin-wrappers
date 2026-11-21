// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.internal.InternalApi
import js.typedarrays.Uint32Array

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface GPUBindingCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/setBindGroup)
     */
    fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsets: ReadonlyArray<GPUBufferDynamicOffset> = definedExternally,
    )

    fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsetsData: Uint32Array<ArrayBufferLike>,
        dynamicOffsetsDataStart: GPUSize64,
        dynamicOffsetsDataLength: GPUSize32,
    )
}
