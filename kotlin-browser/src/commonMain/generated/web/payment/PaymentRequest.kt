// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import js.promise.internal.awaitPromiseLike
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The Payment Request API's **`PaymentRequest`** interface is the primary access point into the API, and lets web content and apps accept payments from the end user on behalf of the operator of the site or the publisher of the app.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
 */
open external class PaymentRequest(
    methodData: ReadonlyArray<PaymentMethodData>,
    details: PaymentDetailsInit,
    options: PaymentOptions = definedExternally,
) : EventTarget {
    /**
     * The **`id`** read-only attribute of the When constructing an instance of the PaymentRequest, you are able to supply an custom id.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
     */
    var onpaymentmethodchange: EventHandler<PaymentMethodChangeEvent, PaymentRequest, PaymentRequest>?

    /**
     * The `PaymentRequest.abort()` method of the PaymentRequest interface causes the user agent to end the payment request and to remove any user interface that might be shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort)
     */
    @JsName("abort")
    fun abortAsync(): Promise<Void>

    /**
     * The PaymentRequest method **`canMakePayment()`** determines whether or not the request is configured in a way that is compatible with at least one payment method supported by the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment)
     */
    @JsName("canMakePayment")
    fun canMakePaymentAsync(): Promise<JsBoolean>

    /**
     * The **PaymentRequest** interface's **`show()`** method instructs the user agent to begin the process of showing and handling the user interface for the payment request to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show)
     */
    @JsName("show")
    fun showAsync(detailsPromise: PaymentDetailsUpdate = definedExternally): Promise<PaymentResponse>

    @JsName("show")
    fun showAsync(detailsPromise: PromiseLike<PaymentDetailsUpdate>): Promise<PaymentResponse>
}

/**
 * The `PaymentRequest.abort()` method of the PaymentRequest interface causes the user agent to end the payment request and to remove any user interface that might be shown.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort)
 */
suspend inline fun PaymentRequest.abort() {
    awaitPromiseLike(abortAsync())
}

/**
 * The PaymentRequest method **`canMakePayment()`** determines whether or not the request is configured in a way that is compatible with at least one payment method supported by the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment)
 */
suspend inline fun PaymentRequest.canMakePayment(): Boolean {
    return awaitPromiseLike(canMakePaymentAsync()).toBoolean()
}

/**
 * The **PaymentRequest** interface's **`show()`** method instructs the user agent to begin the process of showing and handling the user interface for the payment request to the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show)
 */
suspend inline fun PaymentRequest.show(detailsPromise: PaymentDetailsUpdate): PaymentResponse {
    return awaitPromiseLike(showAsync(detailsPromise = detailsPromise))
}

/**
 * The **PaymentRequest** interface's **`show()`** method instructs the user agent to begin the process of showing and handling the user interface for the payment request to the user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show)
 */
suspend inline fun PaymentRequest.show(): PaymentResponse {
    return awaitPromiseLike(showAsync())
}

suspend inline fun PaymentRequest.show(detailsPromise: PromiseLike<PaymentDetailsUpdate>): PaymentResponse {
    return awaitPromiseLike(showAsync(detailsPromise = detailsPromise))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
 */
inline val <C : PaymentRequest> C.paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, C, C>
    get() = EventInstance(this, "paymentmethodchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingaddresschange_event)
 */
inline val <C : PaymentRequest> C.shippingAddressChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, "shippingaddresschange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingoptionchange_event)
 */
inline val <C : PaymentRequest> C.shippingOptionChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, "shippingoptionchange")
