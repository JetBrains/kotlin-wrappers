// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array

external class GPURenderBundleEncoder
private constructor() :
    GPUObjectBase,
    GPUProgrammablePassEncoder,
    GPURenderEncoderBase {
    override var label: String
    override fun draw(
        vertexCount: Int,
        instanceCount: Int,
        firstVertex: Int,
        firstInstance: Int,
    )

    override fun drawIndexed(
        indexCount: Int,
        instanceCount: Int,
        firstIndex: Int,
        baseVertex: Int,
        firstInstance: Int,
    )

    override fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Int,
    )

    override fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Int,
    )

    override fun insertDebugMarker(markerLabel: String)
    override fun popDebugGroup()
    override fun pushDebugGroup(groupLabel: String)
    override fun setBindGroup(
        index: Int,
        bindGroup: GPUBindGroup,
        dynamicOffsets: ReadonlyArray<Double>,
    )

    override fun setBindGroup(
        index: Int,
        bindGroup: GPUBindGroup,
        dynamicOffsetsData: Uint32Array<*>,
        dynamicOffsetsDataStart: Int,
        dynamicOffsetsDataLength: Int,
    )

    override fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: Int,
        size: Int,
    )

    override fun setPipeline(pipeline: GPURenderPipeline)
    override fun setVertexBuffer(
        slot: Int,
        buffer: GPUBuffer,
        offset: Int,
        size: Int,
    )

    fun finish(descriptor: GPURenderBundleDescriptor = definedExternally): GPURenderBundle
}
