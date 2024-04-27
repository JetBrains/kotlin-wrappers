// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
