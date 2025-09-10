// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.serialization.Transferable
import web.serialization.StructuredSerializeOptions
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The `Client` interface represents an executable context such as a Worker, or a SharedWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client)
 */
open external class Client
private constructor() {
    /**
     * The **`frameType`** read-only property of the Client interface indicates the type of browsing context of the current Client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/frameType)
     */
    val frameType: FrameType

    /**
     * The **`id`** read-only property of the Client interface returns the universally unique identifier of the Client object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/id)
     */
    val id: String

    /**
     * The **`type`** read-only property of the Client interface indicates the type of client the service worker is controlling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/type)
     */
    val type: ClientTypes

    /**
     * The **`url`** read-only property of the Client interface returns the URL of the current service worker client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/url)
     */
    val url: String

    /**
     * The **`postMessage()`** method of the Client interface allows a service worker to send a message to a client (a Window, Worker, or SharedWorker).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: String,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    fun postMessage(
        message: String,
        options: StructuredSerializeOptions = definedExternally,
    )
}
