// Automatically generated - do not modify!

package web.gpu

import js.buffer.ArrayBuffer
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer)
 */
external class GPUBuffer
private constructor() :
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState)
     */
    val mapState: GPUBufferMapState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/size)
     */
    val size: GPUSize64Out

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/usage)
     */
    val usage: GPUFlagsConstant

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/destroy)
     */
    fun destroy()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/getMappedRange)
     */
    fun getMappedRange(
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
     */
    fun mapAsync(
        mode: GPUMapModeFlags,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/unmap)
     */
    fun unmap()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
    offset: GPUSize64,
    size: GPUSize64,
) {
    awaitPromiseLike(
        mapAsync(
            mode = mode,
            offset = offset,
            size = size
        )
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
    offset: GPUSize64,
) {
    awaitPromiseLike(
        mapAsync(
            mode = mode,
            offset = offset
        )
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
) {
    awaitPromiseLike(mapAsync(mode = mode))
}
