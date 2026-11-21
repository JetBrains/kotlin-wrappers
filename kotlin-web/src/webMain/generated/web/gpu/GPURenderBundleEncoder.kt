// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.typedarrays.Uint32Array

/**
 * The **`GPURenderBundleEncoder`** interface of the WebGPU API is used to pre-record bundles of commands.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder)
 */
open external class GPURenderBundleEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase,
    GPURenderCommandsMixin {
    /**
     * The **`finish()`** method of the GPURenderBundleEncoder interface completes recording of the current render bundle command sequence, returning a GPURenderBundle object that can be passed into a GPURenderPassEncoder.executeBundles() call to execute those commands in a specific render pass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/finish)
     */
    open fun finish(descriptor: GPURenderBundleDescriptor = definedExternally): GPURenderBundle

    /* `GPUBindingCommandsMixin` overrides */

    override fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsets: ReadonlyArray<GPUBufferDynamicOffset>,
    )

    override fun setBindGroup(
        index: GPUIndex32,
        bindGroup: GPUBindGroup?,
        dynamicOffsetsData: Uint32Array<ArrayBufferLike>,
        dynamicOffsetsDataStart: GPUSize64,
        dynamicOffsetsDataLength: GPUSize32,
    )

    /* `GPUDebugCommandsMixin` overrides */

    override fun insertDebugMarker(markerLabel: String)
    override fun popDebugGroup()
    override fun pushDebugGroup(groupLabel: String)

    /* `GPUObjectBase` overrides */

    override var label: String

    /* `GPURenderCommandsMixin` overrides */

    override fun draw(
        vertexCount: GPUSize32,
        instanceCount: GPUSize32,
        firstVertex: GPUSize32,
        firstInstance: GPUSize32,
    )

    override fun drawIndexed(
        indexCount: GPUSize32,
        instanceCount: GPUSize32,
        firstIndex: GPUSize32,
        baseVertex: GPUSignedOffset32,
        firstInstance: GPUSize32,
    )

    override fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    override fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    override fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: GPUSize64,
        size: GPUSize64,
    )

    override fun setPipeline(pipeline: GPURenderPipeline)
    override fun setVertexBuffer(
        slot: GPUIndex32,
        buffer: GPUBuffer?,
        offset: GPUSize64,
        size: GPUSize64,
    )
}
