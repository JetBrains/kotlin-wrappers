// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import web.buffer.Blob

/**
 * This Push API interface provides methods which let you retrieve the push data sent by a server in various formats.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData)
 */
sealed external class PushMessageData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/arrayBuffer)
     */
    fun arrayBuffer(): ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/blob)
     */
    fun blob(): Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/json)
     */
    fun json(): Any

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/text)
     */
    fun text(): String
}
