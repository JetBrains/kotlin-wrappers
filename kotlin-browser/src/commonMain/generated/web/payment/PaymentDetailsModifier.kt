// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PaymentDetailsModifier {
    val additionalDisplayItems: ReadonlyArray<PaymentItem>?
    val data: JsAny?
    val supportedMethods: String
    val total: PaymentItem?
}
