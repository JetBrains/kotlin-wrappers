// Automatically generated - do not modify!

package web.gpu

external class GPUCommandEncoder
private constructor() :
    GPUObjectBase {
    override var label: String
    fun beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder
    fun beginComputePass(descriptor: GPUComputePassDescriptor = definedExternally): GPUComputePassEncoder
    fun copyBufferToBuffer(
        source: GPUBuffer,
        sourceOffset: GPUSize64,
        destination: GPUBuffer,
        destinationOffset: GPUSize64,
        size: GPUSize64,
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
        destinationOffset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    fun pushDebugGroup(groupLabel: String)
    fun popDebugGroup()
    fun insertDebugMarker(markerLabel: String)
    fun writeTimestamp(
        querySet: GPUQuerySet,
        queryIndex: Int,
    )

    fun resolveQuerySet(
        querySet: GPUQuerySet,
        firstQuery: GPUSize32,
        queryCount: GPUSize32,
        destination: GPUBuffer,
        destinationOffset: GPUSize64,
    )

    fun finish(descriptor: GPUCommandBufferDescriptor = definedExternally): GPUCommandBuffer
}
