// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PaymentDetailsModifier {
    var additionalDisplayItems: ReadonlyArray<PaymentItem>?
    var data: JsAny?
    var supportedMethods: String
    var total: PaymentItem?
}
