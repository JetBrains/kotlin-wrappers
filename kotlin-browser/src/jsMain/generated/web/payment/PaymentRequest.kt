// Automatically generated - do not modify!

package web.payment

import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
 */
external class PaymentRequest(
    methodData: ReadonlyArray<PaymentMethodData>,
    details: PaymentDetailsInit,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id) */
    val id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event) */
    var onpaymentmethodchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort) */
    fun abort(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment) */
    fun canMakePayment(): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show) */
    fun show(detailsPromise: PaymentDetailsUpdate = definedExternally): Promise<PaymentResponse>
    fun show(detailsPromise: Promise<PaymentDetailsUpdate> /* PromiseLike */): Promise<PaymentResponse>
}
