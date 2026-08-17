// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WebTransportErrorSource

inline val WebTransportErrorSource.Companion.session: WebTransportErrorSource
    get() = unsafeCast("session")

inline val WebTransportErrorSource.Companion.stream: WebTransportErrorSource
    get() = unsafeCast("stream")
