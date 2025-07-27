// Automatically generated - do not modify!

package web.payment

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/PaymentMethodChangeEvent/PaymentMethodChangeEvent#options)
 */
@JsPlainObject
external interface PaymentMethodChangeEventInit :
    PaymentRequestUpdateEventInit {
    var methodDetails: JsAny?
    var methodName: String?
}
