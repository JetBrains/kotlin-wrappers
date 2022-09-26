// Automatically generated - do not modify!

package node.stream.web

sealed external interface TextDecoderStream {
    /** Returns encoding's name, lower cased. */
    val encoding: String

    /** Returns `true` if error mode is "fatal", and `false` otherwise. */
    val fatal: Boolean

    /** Returns `true` if ignore BOM flag is set, and `false` otherwise. */
    val ignoreBOM: Boolean
    val readable: ReadableStream<String>
    val writable: WritableStream<Any /* BufferSource */>
    /* readonly [Symbol.toStringTag]: string */
}
