// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.core.Void
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`GPUQueue`** interface of the WebGPU API controls execution of encoded commands on the GPU.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue)
 */
open external class GPUQueue
private constructor() :
    GPUObjectBase {
    /**
     * The **`copyExternalImageToTexture()`** method of the GPUQueue interface copies a snapshot taken from a source image, video, or canvas into a given GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/copyExternalImageToTexture)
     */
    fun copyExternalImageToTexture(
        source: GPUCopyExternalImageSourceInfo,
        destination: GPUCopyExternalImageDestInfo,
        copySize: GPUExtent3D,
    )

    /**
     * The **`onSubmittedWorkDone()`** method of the GPUQueue interface returns a Promise that resolves when all the work submitted to the GPU via this GPUQueue at the point the method is called has been processed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/onSubmittedWorkDone)
     */
    @JsName("onSubmittedWorkDone")
    fun onSubmittedWorkDoneAsync(): Promise<Void>

    /**
     * The **`submit()`** method of the GPUQueue interface schedules the execution of command buffers represented by one or more GPUCommandBuffer objects by the GPU.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/submit)
     */
    fun submit(commandBuffers: ReadonlyArray<GPUCommandBuffer>)

    /**
     * The **`writeBuffer()`** method of the GPUQueue interface writes a provided data source into a given GPUBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/writeBuffer)
     */
    fun writeBuffer(
        buffer: GPUBuffer,
        bufferOffset: GPUSize64,
        data: AllowSharedBufferSource,
        dataOffset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    /**
     * The **`writeTexture()`** method of the GPUQueue interface writes a provided data source into a given GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/writeTexture)
     */
    fun writeTexture(
        destination: GPUTexelCopyTextureInfo,
        data: AllowSharedBufferSource,
        dataLayout: GPUTexelCopyBufferLayout,
        size: GPUExtent3D,
    )
}

/**
 * The **`onSubmittedWorkDone()`** method of the GPUQueue interface returns a Promise that resolves when all the work submitted to the GPU via this GPUQueue at the point the method is called has been processed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/onSubmittedWorkDone)
 */
suspend inline fun GPUQueue.onSubmittedWorkDone() {
    onSubmittedWorkDoneAsync().await()
}
