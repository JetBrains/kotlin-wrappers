// Automatically generated - do not modify!

package web.autofill

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AutoFillBase :
    AutoFill {
    companion object {
        @JsValue("")
        val none: AutoFillBase

        @JsValue("off")
        val off: AutoFillBase

        @JsValue("on")
        val on: AutoFillBase
    }
}
