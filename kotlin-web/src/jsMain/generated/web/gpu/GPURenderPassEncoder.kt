// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array

sealed external class GPURenderPassEncoder :
    GPUObjectBase,
    GPUProgrammablePassEncoder,
    GPURenderEncoderBase {
    override var label: String
    override fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsets: ReadonlyArray<Double>,
    )

    override fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsetsData: Uint32Array,
        dynamicOffsetsDataStart: Number,
        dynamicOffsetsDataLength: Number,
    )

    override fun pushDebugGroup(groupLabel: String)
    override fun popDebugGroup()
    override fun insertDebugMarker(markerLabel: String)
    override fun setPipeline(pipeline: GPURenderPipeline)
    override fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: Number,
        size: Number,
    )

    override fun setVertexBuffer(
        slot: Number,
        buffer: GPUBuffer,
        offset: Number,
        size: Number,
    )

    override fun draw(
        vertexCount: Number,
        instanceCount: Number,
        firstVertex: Number,
        firstInstance: Number,
    )

    override fun drawIndexed(
        indexCount: Number,
        instanceCount: Number,
        firstIndex: Number,
        baseVertex: Number,
        firstInstance: Number,
    )

    override fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Number,
    )

    override fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Number,
    )

    fun setViewport(
        x: GPUIntegerCoordinate,
        y: GPUIntegerCoordinate,
        width: GPUIntegerCoordinate,
        height: GPUIntegerCoordinate,
        minDepth: Float,
        maxDepth: Float,
    )

    fun setScissorRect(
        x: GPUIntegerCoordinate,
        y: GPUIntegerCoordinate,
        width: GPUIntegerCoordinate,
        height: GPUIntegerCoordinate,
    )

    fun setBlendConstant(color: GPUColor)
    fun setStencilReference(reference: GPUStencilValue)
    fun beginOcclusionQuery(queryIndex: GPUSize32)
    fun endOcclusionQuery()
    fun executeBundles(bundles: ReadonlyArray<GPURenderBundle>)
    fun end()
}
