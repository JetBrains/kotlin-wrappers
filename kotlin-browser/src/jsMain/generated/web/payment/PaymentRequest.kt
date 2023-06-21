// Automatically generated - do not modify!

package web.payment

import js.core.ReadonlyArray
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

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
