// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AutoRepeat {
    companion object {
        @JsValue("auto-fill")
        val autoFill: AutoRepeat

        @JsValue("auto-fit")
        val autoFit: AutoRepeat
    }
}
