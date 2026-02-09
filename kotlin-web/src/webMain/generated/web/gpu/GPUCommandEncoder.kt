// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * The **`GPUCommandEncoder`** interface of the WebGPU API represents an encoder that collects a sequence of GPU commands to be issued to the GPU.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder)
 */
open external class GPUCommandEncoder
private constructor() :
    GPUDebugCommandsMixin,
    GPUObjectBase {
    /**
     * The **`beginComputePass()`** method of the GPUCommandEncoder interface starts encoding a compute pass, returning a GPUComputePassEncoder that can be used to control computation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginComputePass)
     */
    fun beginComputePass(descriptor: GPUComputePassDescriptor = definedExternally): GPUComputePassEncoder

    /**
     * The **`beginRenderPass()`** method of the GPUCommandEncoder interface starts encoding a render pass, returning a GPURenderPassEncoder that can be used to control rendering.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass)
     */
    fun beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder

    /**
     * The **`clearBuffer()`** method of the GPUCommandEncoder interface encodes a command that fills a region of a GPUBuffer with zeroes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/clearBuffer)
     */
    fun clearBuffer(
        buffer: GPUBuffer,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    /**
     * The **`copyBufferToBuffer()`** method of the GPUCommandEncoder interface encodes a command that copies data from one GPUBuffer to another.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToBuffer)
     */
    fun copyBufferToBuffer(
        source: GPUBuffer,
        destination: GPUBuffer,
        size: GPUSize64 = definedExternally,
    )

    fun copyBufferToBuffer(
        source: GPUBuffer,
        sourceOffset: GPUSize64,
        destination: GPUBuffer,
        destinationOffset: GPUSize64,
        size: GPUSize64 = definedExternally,
    )

    /**
     * The **`copyBufferToTexture()`** method of the GPUCommandEncoder interface encodes a command that copies data from a GPUBuffer to a GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture)
     */
    fun copyBufferToTexture(
        source: GPUTexelCopyBufferInfo,
        destination: GPUTexelCopyTextureInfo,
        copySize: GPUExtent3D,
    )

    /**
     * The **`copyTextureToBuffer()`** method of the GPUCommandEncoder interface encodes a command that copies data from a GPUTexture to a GPUBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyTextureToBuffer)
     */
    fun copyTextureToBuffer(
        source: GPUTexelCopyTextureInfo,
        destination: GPUTexelCopyBufferInfo,
        copySize: GPUExtent3D,
    )

    /**
     * The **`copyTextureToTexture()`** method of the GPUCommandEncoder interface encodes a command that copies data from one GPUTexture to another.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyTextureToTexture)
     */
    fun copyTextureToTexture(
        source: GPUTexelCopyTextureInfo,
        destination: GPUTexelCopyTextureInfo,
        copySize: GPUExtent3D,
    )

    /**
     * The **`finish()`** method of the GPUCommandEncoder interface completes recording of the command sequence encoded on this GPUCommandEncoder, returning a corresponding GPUCommandBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/finish)
     */
    fun finish(descriptor: GPUCommandBufferDescriptor = definedExternally): GPUCommandBuffer

    /**
     * The **`resolveQuerySet()`** method of the GPUCommandEncoder interface encodes a command that resolves a GPUQuerySet, copying the results into a specified GPUBuffer.
     *
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
