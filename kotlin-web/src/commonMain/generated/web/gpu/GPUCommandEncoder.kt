// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder)
 */
external class GPUCommandEncoder
private constructor() :
    GPUDebugCommandsMixin,
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginComputePass)
     */
    fun beginComputePass(descriptor: GPUComputePassDescriptor = definedExternally): GPUComputePassEncoder

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass)
     */
    fun beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/clearBuffer)
     */
    fun clearBuffer(
        buffer: GPUBuffer,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToBuffer)
     */
    fun copyBufferToBuffer(
        source: GPUBuffer,
        sourceOffset: GPUSize64,
        destination: GPUBuffer,
        destinationOffset: GPUSize64,
        size: GPUSize64,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture)
     */
    fun copyBufferToTexture(
        source: GPUTexelCopyBufferInfo,
        destination: GPUTexelCopyTextureInfo,
        copySize: GPUExtent3D,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyTextureToBuffer)
     */
    fun copyTextureToBuffer(
        source: GPUTexelCopyTextureInfo,
        destination: GPUTexelCopyBufferInfo,
        copySize: GPUExtent3D,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyTextureToTexture)
     */
    fun copyTextureToTexture(
        source: GPUTexelCopyTextureInfo,
        destination: GPUTexelCopyTextureInfo,
        copySize: GPUExtent3D,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/finish)
     */
    fun finish(descriptor: GPUCommandBufferDescriptor = definedExternally): GPUCommandBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/resolveQuerySet)
     */
    fun resolveQuerySet(
        querySet: GPUQuerySet,
        firstQuery: GPUSize32,
        queryCount: GPUSize32,
        destination: GPUBuffer,
        destinationOffset: GPUSize64,
    )
}
