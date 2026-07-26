@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package react.dom.server

import js.promise.Promise
import js.void.Void
import web.streams.ReadableStream

external interface ReactDOMServerReadableStream :
    ReadableStream<Any?> {
    val allReady: Promise<Void>
}
