// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PaymentDetailsModifier {
    var additionalDisplayItems: ReadonlyArray<PaymentItem>?
    var data: JsAny?
    var supportedMethods: String
    var total: PaymentItem?
}
