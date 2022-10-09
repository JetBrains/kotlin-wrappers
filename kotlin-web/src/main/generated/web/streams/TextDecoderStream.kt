// Automatically generated - do not modify!

package web.streams

import kotlinx.js.BufferSource

sealed external interface TextDecoderStream {
    /** Returns encoding's name, lower cased. */
    val encoding: String

    /** Returns `true` if error mode is "fatal", and `false` otherwise. */
    val fatal: Boolean

    /** Returns `true` if ignore BOM flag is set, and `false` otherwise. */
    val ignoreBOM: Boolean
    val readable: ReadableStream<String>
    val writable: WritableStream<BufferSource>
    /* readonly [Symbol.toStringTag]: string */
}
