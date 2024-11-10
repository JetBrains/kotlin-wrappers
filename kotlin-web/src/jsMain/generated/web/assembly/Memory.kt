// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.ArrayBuffer

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Memory)
 */
open external class Memory(
    descriptor: MemoryDescriptor,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Memory/buffer)
     */
    val buffer: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Memory/grow)
     */
    fun grow(delta: Int): Int
}
