// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CanPlayTypeResult {
    companion object {
        @JsValue("")
        val none: CanPlayTypeResult

        @JsValue("maybe")
        val maybe: CanPlayTypeResult

        @JsValue("probably")
        val probably: CanPlayTypeResult
    }
}
