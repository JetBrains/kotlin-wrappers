// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.payment

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PaymentComplete {
    companion object {
        @JsValue("fail")
        val fail: PaymentComplete

        @JsValue("success")
        val success: PaymentComplete

        @JsValue("unknown")
        val unknown: PaymentComplete
    }
}
