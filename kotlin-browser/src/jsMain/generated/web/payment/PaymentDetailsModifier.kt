// Automatically generated - do not modify!

package web.payment

import js.core.ReadonlyArray

sealed external interface PaymentDetailsModifier {
    var additionalDisplayItems: ReadonlyArray<PaymentItem>?
    var data: Any?
    var supportedMethods: String
    var total: PaymentItem?
}
