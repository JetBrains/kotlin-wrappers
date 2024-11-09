// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

external class GPUQueue
private constructor() :
    GPUObjectBase {
    override var label: String
    fun submit(commandBuffers: ReadonlyArray<GPUCommandBuffer>)

    @JsAsync
    suspend fun onSubmittedWorkDone()

    @JsName("onSubmittedWorkDone")
    fun onSubmittedWorkDoneAsync(): Promise<Void>
    fun writeBuffer(
        buffer: GPUBuffer,
        bufferOffset: GPUSize64,
        data: BufferSource,
        dataOffset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    fun writeTexture(
        destination: GPUImageCopyTexture,
        data: BufferSource,
        dataLayout: GPUImageDataLayout,
        size: GPUExtent3D,
    )
}
