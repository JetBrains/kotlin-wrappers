// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BorderCollapse {
    companion object {
        @JsValue("collapse")
        val collapse: BorderCollapse

        @JsValue("separate")
        val separate: BorderCollapse
    }
}
