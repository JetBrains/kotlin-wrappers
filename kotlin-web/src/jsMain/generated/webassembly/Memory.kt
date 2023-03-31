// Automatically generated - do not modify!

package webassembly

import js.buffer.ArrayBuffer

sealed external interface Memory {
    val buffer: ArrayBuffer
    fun grow(delta: Number): Number
}
