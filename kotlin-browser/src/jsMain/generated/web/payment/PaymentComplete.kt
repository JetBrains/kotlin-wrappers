// Automatically generated - do not modify!

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
