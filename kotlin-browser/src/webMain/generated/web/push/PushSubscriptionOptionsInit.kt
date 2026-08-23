// Automatically generated - do not modify!

package web.push

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState#options)
 */
@JsPlainObject
external interface PushSubscriptionOptionsInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState#applicationserverkey)
     */
    var applicationServerKey: BufferSource /* | String */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState#uservisibleonly)
     */
    var userVisibleOnly: Boolean?
}
