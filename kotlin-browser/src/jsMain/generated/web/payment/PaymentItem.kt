// Automatically generated - do not modify!

package web.payment

sealed external interface PaymentItem {
    var amount: PaymentCurrencyAmount
    var label: String
    var pending: Boolean?
}
