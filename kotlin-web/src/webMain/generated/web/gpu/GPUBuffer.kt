// Automatically generated - do not modify!

package web.gpu

import js.buffer.ArrayBuffer
import js.core.Void
import js.promise.Promise
import js.promise.await
import kotlin.js.definedExternally

/**
 * The **`GPUBuffer`** interface of the WebGPU API represents a block of memory that can be used to store raw data to use in GPU operations.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer)
 */
open external class GPUBuffer
private constructor() :
    GPUObjectBase {
    /**
     * The **`mapState`** read-only property of the GPUBuffer interface represents the mapped state of the GPUBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState)
     */
    val mapState: GPUBufferMapState

    /**
     * The **`size`** read-only property of the GPUBuffer interface represents the length of the GPUBuffer's memory allocation, in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/size)
     */
    val size: GPUSize64Out

    /**
     * The **`usage`** read-only property of the GPUBuffer interface contains the bitwise flags representing the allowed usages of the GPUBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/usage)
     */
    val usage: GPUFlagsConstant

    /**
     * The **`destroy()`** method of the GPUBuffer interface destroys the GPUBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/destroy)
     */
    fun destroy()

    /**
     * The **`getMappedRange()`** method of the GPUBuffer interface returns an ArrayBuffer containing the mapped contents of the GPUBuffer in the specified range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/getMappedRange)
     */
    fun getMappedRange(
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): ArrayBuffer

    /**
     * The **`mapAsync()`** method of the GPUBuffer interface maps the specified range of the GPUBuffer. It returns a Promise that resolves when the GPUBuffer's content is ready to be accessed. While the GPUBuffer is mapped it cannot be used in any GPU commands.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
     */
    fun mapAsync(
        mode: GPUMapModeFlags,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): Promise<Void>

    /**
     * The **`unmap()`** method of the GPUBuffer interface unmaps the mapped range of the GPUBuffer, making its contents available for use by the GPU again after it has previously been mapped with GPUBuffer.mapAsync() (the GPU cannot access a mapped GPUBuffer).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/unmap)
     */
    fun unmap()
}

/**
 * The **`mapAsync()`** method of the GPUBuffer interface maps the specified range of the GPUBuffer. It returns a Promise that resolves when the GPUBuffer's content is ready to be accessed. While the GPUBuffer is mapped it cannot be used in any GPU commands.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
) {
    mapAsync(
        mode = mode,
    ).await()
}

/**
 * The **`mapAsync()`** method of the GPUBuffer interface maps the specified range of the GPUBuffer. It returns a Promise that resolves when the GPUBuffer's content is ready to be accessed. While the GPUBuffer is mapped it cannot be used in any GPU commands.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
    offset: GPUSize64,
) {
    mapAsync(
        mode = mode,
        offset = offset,
    ).await()
}

/**
 * The **`mapAsync()`** method of the GPUBuffer interface maps the specified range of the GPUBuffer. It returns a Promise that resolves when the GPUBuffer's content is ready to be accessed. While the GPUBuffer is mapped it cannot be used in any GPU commands.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapAsync)
 */
suspend inline fun GPUBuffer.map(
    mode: GPUMapModeFlags,
    offset: GPUSize64,
    size: GPUSize64,
) {
    mapAsync(
        mode = mode,
        offset = offset,
        size = size,
    ).await()
}
