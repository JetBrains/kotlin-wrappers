// Automatically generated - do not modify!

package web.payment

import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/PaymentMethodChangeEvent#options)
 */
@JsPlainObject
external interface PaymentMethodChangeEventInit :
    PaymentRequestUpdateEventInit {
    var methodDetails: JsAny?
    var methodName: String?
}
