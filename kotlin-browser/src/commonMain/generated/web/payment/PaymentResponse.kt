// Automatically generated - do not modify!

package web.payment

import js.core.JsAny
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`PaymentResponse`** interface of the Payment Request API is returned after a user selects a payment method and approves a payment request.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse)
 */
external class PaymentResponse
private constructor() :
    EventTarget {
    /**
     * The **`details`** read-only property of the provides a payment method specific message used by the merchant to process the transaction and determine a successful funds transfer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/details)
     */
    val details: JsAny?

    /**
     * The **`methodName`** read-only property of the PaymentResponse interface returns a string uniquely identifying the payment handler selected by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/methodName)
     */
    val methodName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event)
     */
    var onpayerdetailchange: EventHandler<PaymentRequestUpdateEvent, PaymentResponse, PaymentResponse>?

    /**
     * The `payerEmail` read-only property of the PaymentResponse interface returns the email address supplied by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerEmail)
     */
    val payerEmail: String?

    /**
     * The **`payerName`** read-only property of the option is only present when the `requestPayerName` option is set to `true` in the options parameter of the A string containing the payer name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerName)
     */
    val payerName: String?

    /**
     * The `payerPhone` read-only property of the PaymentResponse interface returns the phone number supplied by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerPhone)
     */
    val payerPhone: String?

    /**
     * The **`requestId`** read-only property of the the `PaymentResponse()` constructor by details.id.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/requestId)
     */
    val requestId: String

    /**
     * The **`shippingAddress`** read-only property of the `PaymentRequest` interface returns a PaymentAddress object containing the shipping address provided by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingAddress)
     */
    val shippingAddress: PaymentAddress?

    /**
     * The **`shippingOption`** read-only property of the `PaymentRequest` interface returns the ID attribute of the shipping option selected by the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingOption)
     */
    val shippingOption: String?

    /**
     * The PaymentRequest method **`complete()`** of the Payment Request API notifies the user interface to be closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/complete)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun complete(result: PaymentComplete = definedExternally)

    @JsName("complete")
    fun completeAsync(result: PaymentComplete = definedExternally): Promise<Void>

    /**
     * The PaymentResponse interface's **`retry()`** method makes it possible to ask the user to retry a payment after an error occurs during processing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun retry(errorFields: PaymentValidationErrors = definedExternally)

    @JsName("retry")
    fun retryAsync(errorFields: PaymentValidationErrors = definedExternally): Promise<Void>

    /**
     * The **`toJSON()`** method of the PaymentResponse interface is a Serialization; it returns a JSON representation of the PaymentResponse object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/toJSON)
     */
    fun toJSON(): JsAny
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event)
 */
inline val <C : PaymentResponse> C.payerDetailChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, "payerdetailchange")
