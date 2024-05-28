// Automatically generated - do not modify!

package web.gpu

import js.buffer.ArrayBuffer
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

sealed external class GPUBuffer :
    GPUObjectBase {
    override var label: String
    val size: GPUSize64Out
    val usage: GPUUsage
    val mapState: GPUBufferMapState

    @JsAsync
    suspend fun map(
        mode: GPUMapMode,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    )

    fun mapAsync(
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
