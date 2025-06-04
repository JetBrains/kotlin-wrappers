// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.JsAny
import js.typedarrays.Uint8Array
import web.blob.Blob

/**
 * The **`PushMessageData`** interface of the Push API provides methods which let you retrieve the push data sent by a server in various formats.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData)
 */
external class PushMessageData
private constructor() {
    /**
     * The **`arrayBuffer()`** method of the PushMessageData interface extracts push message data as an ArrayBuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/arrayBuffer)
     */
    fun arrayBuffer(): ArrayBuffer

    /**
     * The **`blob()`** method of the PushMessageData interface extracts push message data as a Blob object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/blob)
     */
    fun blob(): Blob

    /**
     * The **`bytes()`** method of the PushMessageData interface extracts push message data as an Uint8Array object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/bytes)
     */
    fun bytes(): Uint8Array<ArrayBuffer>

    /**
     * The **`json()`** method of the PushMessageData interface extracts push message data by parsing it as a JSON string and returning the result.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/json)
     */
    fun json(): JsAny

    /**
     * The **`text()`** method of the PushMessageData interface extracts push message data as a plain text string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/text)
     */
    fun text(): String
}
