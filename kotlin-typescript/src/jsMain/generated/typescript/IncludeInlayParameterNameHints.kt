// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface IncludeInlayParameterNameHints {
    companion object {
        @JsValue("none")
        val none: IncludeInlayParameterNameHints

        @JsValue("literals")
        val literals: IncludeInlayParameterNameHints

        @JsValue("all")
        val all: IncludeInlayParameterNameHints
    }
}
