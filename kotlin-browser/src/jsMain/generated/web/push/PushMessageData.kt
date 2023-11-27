// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import web.buffer.Blob

sealed external class PushMessageData {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/arrayBuffer) */
    fun arrayBuffer(): ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/blob) */
    fun blob(): Blob

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/json) */
    fun json(): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/text) */
    fun text(): String
}
