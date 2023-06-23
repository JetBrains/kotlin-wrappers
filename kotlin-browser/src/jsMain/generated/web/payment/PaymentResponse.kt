// Automatically generated - do not modify!

package web.payment

import js.core.Void
import web.events.EventTarget
import kotlin.js.Promise

/**
 * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse)
 */
sealed external class PaymentResponse :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/details) */
    val details: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/methodName) */
    val methodName: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/requestId) */
    val requestId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/complete) */
    fun complete(result: PaymentComplete = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry) */
    fun retry(errorFields: PaymentValidationErrors = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/toJSON) */
    fun toJSON(): Any
}
