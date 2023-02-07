// Automatically generated - do not modify!

package web.streams

import js.typedarrays.Uint8Array

sealed external interface TextEncoderStream {
    /** Returns "utf-8". */
    val encoding: String /* 'utf-8' */
    val readable: ReadableStream<Uint8Array>
    val writable: WritableStream<String>
    /* readonly [Symbol.toStringTag]: string */
}
