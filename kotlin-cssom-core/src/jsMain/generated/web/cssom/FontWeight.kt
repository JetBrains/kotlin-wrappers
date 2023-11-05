// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontWeight {
    companion object {
        @JsValue("bold")
        val bold: FontWeight

        @JsValue("normal")
        val normal: FontWeight

        @JsValue("bolder")
        val bolder: FontWeight

        @JsValue("lighter")
        val lighter: FontWeight
    }
}
