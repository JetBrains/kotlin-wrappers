// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventTarget

/**
 * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
 */
open external class PaymentRequest(
    methodData: ReadonlyArray<PaymentMethodData>,
    details: PaymentDetailsInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
     */
    var onpaymentmethodchange: EventHandler<PaymentMethodChangeEvent, PaymentRequest, PaymentRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort)
     */
    @JsAsync
    suspend fun abort()

    @JsName("abort")
    fun abortAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment)
     */
    @JsAsync
    suspend fun canMakePayment(): Boolean

    @JsName("canMakePayment")
    fun canMakePaymentAsync(): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show)
     */
    @JsAsync
    suspend fun show(detailsPromise: PaymentDetailsUpdate = definedExternally): PaymentResponse

    @JsName("show")
    fun showAsync(detailsPromise: PaymentDetailsUpdate = definedExternally): Promise<PaymentResponse>

    @JsAsync
    suspend fun show(detailsPromise: PromiseLike<PaymentDetailsUpdate>): PaymentResponse

    @JsName("show")
    fun showAsync(detailsPromise: PromiseLike<PaymentDetailsUpdate>): Promise<PaymentResponse>
}
