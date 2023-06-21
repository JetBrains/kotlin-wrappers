// Automatically generated - do not modify!

package web.serviceworker

import js.core.ReadonlyArray
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable

sealed external class Client {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/frameType) */
    val frameType: FrameType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/id) */
    val id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/type) */
    val type: ClientTypes

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/url) */
    val url: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/postMessage) */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
