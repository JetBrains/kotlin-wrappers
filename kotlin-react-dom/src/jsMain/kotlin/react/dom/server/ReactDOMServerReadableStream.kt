@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package react.dom.server

import js.core.Void
import js.promise.Promise
import web.streams.ReadableStream

external interface ReactDOMServerReadableStream :
    ReadableStream<Any?> {
    val allReady: Promise<Void>
}
