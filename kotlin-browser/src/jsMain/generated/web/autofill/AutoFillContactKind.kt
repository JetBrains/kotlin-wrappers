// Automatically generated - do not modify!

package web.autofill

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AutoFillContactKind {
    companion object {
        @JsValue("home")
        val home: AutoFillContactKind

        @JsValue("mobile")
        val mobile: AutoFillContactKind

        @JsValue("work")
        val work: AutoFillContactKind
    }
}
