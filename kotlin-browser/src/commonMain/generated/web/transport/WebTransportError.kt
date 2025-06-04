// Automatically generated - do not modify!

package web.transport

import js.serialization.Serializable
import web.errors.DOMException
import kotlin.js.definedExternally

/**
 * The **`WebTransportError`** interface of the WebTransport API represents an error related to the API, which can arise from server errors, network connection problems, or client-initiated abort operations (for example, arising from a WritableStream.abort() call).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError)
 */
open external class WebTransportError(
    message: String = definedExternally,
    options: WebTransportErrorOptions = definedExternally,
) : DOMException,
    Serializable {
    /**
     * The **`source`** read-only property of the WebTransportError interface returns an enumerated value indicating the source of the error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source)
     */
    val source: WebTransportErrorSource

    /**
     * The **`streamErrorCode`** read-only property of the WebTransportError interface returns a number in the range 0-255 indicating the application protocol error code for this error, or `null` if one is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/streamErrorCode)
     */
    val streamErrorCode: Int?
}
