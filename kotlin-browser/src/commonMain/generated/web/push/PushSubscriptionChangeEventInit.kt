// Automatically generated - do not modify!

package web.push

import js.objects.JsPlainObject
import web.serviceworker.ExtendableEventInit

@JsPlainObject
external interface PushSubscriptionChangeEventInit :
    ExtendableEventInit {
    var newSubscription: PushSubscription?
    var oldSubscription: PushSubscription?
}
