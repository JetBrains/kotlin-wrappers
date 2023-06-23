// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.ArrayBuffer

/** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory) */
external class Memory(
    descriptor: MemoryDescriptor,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/buffer) */
    val buffer: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/grow) */
    fun grow(delta: Number): Number
}
