// Automatically generated - do not modify!

package web.payment

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse)
 */
sealed external class PaymentResponse :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/details)
     */
    val details: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/methodName)
     */
    val methodName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event)
     */
    var onpayerdetailchange: EventHandler<PaymentRequestUpdateEvent, PaymentResponse, PaymentResponse>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerEmail)
     */
    val payerEmail: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerName)
     */
    val payerName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerPhone)
     */
    val payerPhone: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/requestId)
     */
    val requestId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingAddress)
     */
    val shippingAddress: PaymentAddress?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingOption)
     */
    val shippingOption: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/complete)
     */
    @JsAsync
    suspend fun complete(result: PaymentComplete = definedExternally)

    @JsName("complete")
    fun completeAsync(result: PaymentComplete = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry)
     */
    @JsAsync
    suspend fun retry(errorFields: PaymentValidationErrors = definedExternally)

    @JsName("retry")
    fun retryAsync(errorFields: PaymentValidationErrors = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/toJSON)
     */
    fun toJSON(): Any

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event)
     */
    @JsEvent("payerdetailchange")
    val payerDetailChangeEvent: EventInstance<PaymentRequestUpdateEvent, PaymentResponse /* this */, PaymentResponse /* this */>
}
