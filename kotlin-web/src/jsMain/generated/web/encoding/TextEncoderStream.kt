// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.encoding

import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

external class TextEncoderStream :
    GenericTransformStream,
    TextEncoderCommon {
    override val readable: ReadableStream<Uint8Array>
    override val writable: WritableStream<String>
}
