// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.StructuredSerializeOptions
import js.core.Transferable

/**
 * The Client interface represents an executable context such as a Worker, or a SharedWorker. Window clients are represented by the more-specific WindowClient. You can get Client/WindowClient objects from methods such as Clients.matchAll() and Clients.get().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client)
 */
sealed external class Client {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/frameType)
     */
    val frameType: FrameType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/type)
     */
    val type: ClientTypes

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/url)
     */
    val url: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/postMessage)
     */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
