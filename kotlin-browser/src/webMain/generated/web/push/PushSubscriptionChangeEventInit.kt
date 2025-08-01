// Automatically generated - do not modify!

package web.push

import js.objects.JsPlainObject
import web.serviceworker.ExtendableEventInit

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/PushSubscriptionChangeEvent/PushSubscriptionChangeEvent#options)
 */
@JsPlainObject
external interface PushSubscriptionChangeEventInit :
    ExtendableEventInit {
    var newSubscription: PushSubscription?
    var oldSubscription: PushSubscription?
}
