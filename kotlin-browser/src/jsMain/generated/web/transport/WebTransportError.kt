// Automatically generated - do not modify!

package web.transport

import web.errors.DOMException

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError)
 */
external class WebTransportError(
    message: String = definedExternally,
    options: WebTransportErrorOptions = definedExternally,
) : DOMException {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source) */
    val source: WebTransportErrorSource

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/streamErrorCode) */
    val streamErrorCode: Int?
}
