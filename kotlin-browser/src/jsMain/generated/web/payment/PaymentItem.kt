// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PaymentItem {
    var amount: PaymentCurrencyAmount
    var label: String
    var pending: Boolean?
}
