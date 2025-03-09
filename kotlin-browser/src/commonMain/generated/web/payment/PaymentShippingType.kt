// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue

sealed external interface PaymentShippingType {
    companion object {
        @JsValue("delivery")
        val delivery: PaymentShippingType

        @JsValue("pickup")
        val pickup: PaymentShippingType

        @JsValue("shipping")
        val shipping: PaymentShippingType
    }
}
