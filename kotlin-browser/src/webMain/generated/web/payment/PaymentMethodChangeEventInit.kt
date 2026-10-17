// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/PaymentMethodChangeEvent#options)
 */
@JsPlainObject
external interface PaymentMethodChangeEventInit :
    PaymentRequestUpdateEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/PaymentMethodChangeEvent#methodDetails)
     */
    var methodDetails: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/PaymentMethodChangeEvent#methodName)
     */
    var methodName: String?
}
