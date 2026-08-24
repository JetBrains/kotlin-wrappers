// Automatically generated - do not modify!

package web.push

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON#return_value)
 */
@JsPlainObject
external interface PushSubscriptionJSON {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON#endpoint)
     */
    var endpoint: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON#expirationtime)
     */
    var expirationTime: EpochTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON#keys)
     */
    var keys: ReadonlyRecord<JsString, JsString>?
}
