// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.ArrayBuffer

external class Memory(
    descriptor: MemoryDescriptor,
) {
    val buffer: ArrayBuffer
    fun grow(delta: Number): Number
}
