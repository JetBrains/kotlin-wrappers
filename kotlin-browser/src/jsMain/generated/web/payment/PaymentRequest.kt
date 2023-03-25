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
    val id: String
    var onpaymentmethodchange: EventHandler<Event>?
    fun abort(): Promise<Void>
    fun canMakePayment(): Promise<Boolean>
    fun show(detailsPromise: PaymentDetailsUpdate = definedExternally): Promise<PaymentResponse>
    fun show(detailsPromise: Promise<PaymentDetailsUpdate> /* PromiseLike */): Promise<PaymentResponse>
}
