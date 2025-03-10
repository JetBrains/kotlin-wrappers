// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.payment

import seskar.js.JsValue

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
