// Automatically generated - do not modify!

package web.gpu

sealed external interface GPURenderEncoderBase {
    fun setPipeline(pipeline: GPURenderPipeline)
    fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: Int = definedExternally,
        size: Int = definedExternally,
    )

    fun setVertexBuffer(
        slot: Int,
        buffer: GPUBuffer,
        offset: Int = definedExternally,
        size: Int = definedExternally,
    )

    fun draw(
        vertexCount: Int,
        instanceCount: Int = definedExternally,
        firstVertex: Int = definedExternally,
        firstInstance: Int = definedExternally,
    )

    fun drawIndexed(
        indexCount: Int,
        instanceCount: Int = definedExternally,
        firstIndex: Int = definedExternally,
        baseVertex: Int = definedExternally,
        firstInstance: Int = definedExternally,
    )

    fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Int,
    )

    fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: Int,
    )
}
