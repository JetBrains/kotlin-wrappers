// Automatically generated - do not modify!

package web.gpu

import js.buffer.ArrayBuffer
import js.core.Void
import js.promise.Promise

sealed external class GPUBuffer :
    GPUObjectBase {
    override var label: String
    val size: Number
    val usage: GPUConstant
    val mapState: GPUBufferMapState
    fun mapAsync(
        mode: GPUMapMode,
        offset: Number = definedExternally,
        size: Number = definedExternally,
    ): Promise<Void>

    fun getMappedRange(
        offset: Number = definedExternally,
        size: Number = definedExternally,
    ): ArrayBuffer

    fun unmap()
    fun destroy()
}
