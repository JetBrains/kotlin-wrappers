// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import js.transferable.Transferable
import web.serialization.StructuredSerializeOptions
import kotlin.js.definedExternally

/**
 * The `Client` interface represents an executable context such as a Worker, or a SharedWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client)
 */
open external class Client
private constructor() {
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
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
