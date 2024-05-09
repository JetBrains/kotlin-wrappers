// Automatically generated - do not modify!

package web.gpu

import js.buffer.ArrayBuffer
import js.core.Void
import js.promise.Promise

sealed external class GPUBuffer :
    GPUObjectBase {
    override var label: String
    val size: GPUSize64Out
    val usage: GPUUsage
    val mapState: GPUBufferMapState
    suspend fun mapAsync(
        mode: GPUMapMode,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    @JsName("mapAsync")
    fun mapAsyncAsync(
        mode: GPUMapMode,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): Promise<Void>

    fun getMappedRange(
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): ArrayBuffer

    fun unmap()
    fun destroy()
}
