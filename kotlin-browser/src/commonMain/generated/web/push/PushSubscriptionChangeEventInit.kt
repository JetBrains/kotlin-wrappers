// Automatically generated - do not modify!

package web.push

import js.objects.JsPlainObject
import web.serviceworker.ExtendableEventInit

@JsPlainObject
external interface PushSubscriptionChangeEventInit :
    ExtendableEventInit {
    val newSubscription: PushSubscription?
    val oldSubscription: PushSubscription?
}
