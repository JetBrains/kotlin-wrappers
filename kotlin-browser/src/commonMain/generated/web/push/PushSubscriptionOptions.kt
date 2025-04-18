// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer

/**
 * The **`PushSubscriptionOptions`** interface of the Push API represents the options associated with a push subscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions)
 */
external class PushSubscriptionOptions
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/applicationServerKey)
     */
    val applicationServerKey: ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/userVisibleOnly)
     */
    val userVisibleOnly: Boolean
}
