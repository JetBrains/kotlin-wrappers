// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer

/**
 * The **`PushSubscriptionOptions`** interface of the Push API represents the options associated with a push subscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions)
 */
open external class PushSubscriptionOptions
private constructor() {
    /**
     * The **`applicationServerKey`** read-only property of the PushSubscriptionOptions interface contains the public key used by the push server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/applicationServerKey)
     */
    val applicationServerKey: ArrayBuffer?

    /**
     * The **`userVisibleOnly`** read-only property of the PushSubscriptionOptions interface indicates if the returned push subscription will only be used for messages whose effect is made visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscriptionOptions/userVisibleOnly)
     */
    val userVisibleOnly: Boolean
}
