// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.core.Void
import js.promise.Promise

sealed external class GPUQueue :
    GPUObjectBase {
    override var label: String
    fun submit(commandBuffers: ReadonlyArray<GPUCommandBuffer>)
    fun onSubmittedWorkDone(): Promise<Void>
    fun writeBuffer(
        buffer: GPUBuffer,
        bufferOffset: Number,
        data: BufferSource,
        dataOffset: Number = definedExternally,
        size: Number = definedExternally,
    )

    fun writeTexture(
        destination: GPUImageCopyTexture,
        data: BufferSource,
        dataLayout: GPUImageDataLayout,
        size: GPUExtent3D,
    )
}
