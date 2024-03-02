// Automatically generated - do not modify!

package web.gpu

sealed external class GPUCommandEncoder :
    GPUObjectBase {
    override var label: String
    fun beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder
    fun beginComputePass(descriptor: GPUComputePassDescriptor = definedExternally): GPUComputePassEncoder
    fun copyBufferToBuffer(
        source: GPUBuffer,
        sourceOffset: Number,
        destination: GPUBuffer,
        destinationOffset: Number,
        size: Number,
    )

    fun copyBufferToTexture(
        source: GPUImageCopyBuffer,
        destination: GPUImageCopyTexture,
        copySize: GPUExtent3D,
    )

    fun copyTextureToBuffer(
        source: GPUImageCopyTexture,
        destination: GPUImageCopyBuffer,
        copySize: GPUExtent3D,
    )

    fun copyTextureToTexture(
        source: GPUImageCopyTexture,
        destination: GPUImageCopyTexture,
        copySize: GPUExtent3D,
    )

    fun clearBuffer(
        destination: GPUBuffer,
        destinationOffset: Number = definedExternally,
        size: Number = definedExternally,
    )

    fun pushDebugGroup(groupLabel: String)
    fun popDebugGroup()
    fun insertDebugMarker(markerLabel: String)
    fun writeTimestamp(
        querySet: GPUQuerySet,
        queryIndex: Number,
    )

    fun resolveQuerySet(
        querySet: GPUQuerySet,
        firstQuery: Number,
        queryCount: Number,
        destination: GPUBuffer,
        destinationOffset: Number,
    )

    fun finish(descriptor: GPUCommandBufferDescriptor = definedExternally): GPUCommandBuffer
}
