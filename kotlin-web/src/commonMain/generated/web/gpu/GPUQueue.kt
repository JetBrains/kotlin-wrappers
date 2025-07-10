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
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue)
 */
external class GPUQueue
private constructor() :
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/copyExternalImageToTexture)
     */
    fun copyExternalImageToTexture(
        source: GPUCopyExternalImageSourceInfo,
        destination: GPUCopyExternalImageDestInfo,
        copySize: GPUExtent3D,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/onSubmittedWorkDone)
     */
    @JsName("onSubmittedWorkDone")
    fun onSubmittedWorkDoneAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/submit)
     */
    fun submit(commandBuffers: ReadonlyArray<GPUCommandBuffer>)

    /**
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
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/onSubmittedWorkDone)
 */
suspend inline fun GPUQueue.onSubmittedWorkDone() {
    onSubmittedWorkDoneAsync().await()
}
