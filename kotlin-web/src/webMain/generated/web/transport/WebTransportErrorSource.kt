// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source)
 */
@JsUnion
sealed /* union */
external interface WebTransportErrorSource

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source#session)
 */
inline val WebTransportErrorSource.Companion.session: WebTransportErrorSource
    get() = unsafeCast("session")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source#stream)
 */
inline val WebTransportErrorSource.Companion.stream: WebTransportErrorSource
    get() = unsafeCast("stream")
