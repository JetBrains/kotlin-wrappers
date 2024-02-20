// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.objects.JsPlainObject

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions)
 */
@JsPlainObject
sealed external class PushSubscriptionOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/applicationServerKey)
     */
    val applicationServerKey: ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/userVisibleOnly)
     */
    val userVisibleOnly: Boolean
}
