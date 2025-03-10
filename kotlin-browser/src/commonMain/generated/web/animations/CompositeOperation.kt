// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.animations

import seskar.js.JsValue

sealed external interface CompositeOperation {
    companion object {
        @JsValue("accumulate")
        val accumulate: CompositeOperation

        @JsValue("add")
        val add: CompositeOperation

        @JsValue("replace")
        val replace: CompositeOperation
    }
}
