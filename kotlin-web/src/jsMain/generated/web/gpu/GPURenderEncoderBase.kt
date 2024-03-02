// Automatically generated - do not modify!

package web.gpu

sealed external interface GPURenderEncoderBase {
    fun setPipeline(pipeline: GPURenderPipeline)
    fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: Number = definedExternally,
        size: Number = definedExternally,
    )

    fun setVertexBuffer(
        slot: Number,
        buffer: GPUBuffer,
        offset: Number = definedExternally,
        size: Number = definedExternally,
    )

    fun draw(
        vertexCount: Number,
        instanceCount: Number = definedExternally,
        firstVertex: Number = definedExternally,
        firstInstance: Number = definedExternally,
    )

    fun drawIndexed(
        indexCount: Number,
        instanceCount: Number = definedExternally,
        firstIndex: Number = definedExternally,
        baseVertex: Number = definedExternally,
        firstInstance: Number = definedExternally,
    )

    fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Number,
    )

    fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Number,
    )
}
