// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.ArrayBuffer
import kotlin.js.JsQualifier

/**
 * The **`WebAssembly.Memory`** object is a resizable ArrayBuffer or SharedArrayBuffer that holds raw bytes of memory accessed by a `WebAssembly.Instance`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Memory)
 */
open external class Memory(
    descriptor: MemoryDescriptor,
) {
    /**
     * The read-only **`buffer`** prototype property of the `WebAssembly.Memory` object returns the buffer contained in the memory.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Memory/buffer)
     */
    val buffer: ArrayBuffer

    /**
     * The **`grow()`** prototype method of the `WebAssembly.Memory` object increases the size of the memory instance by a specified number of WebAssembly pages.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Memory/grow)
     */
    fun grow(delta: AddressValue): AddressValue
}
