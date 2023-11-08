// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DocumentVisibilityState {
    companion object {
        @JsValue("hidden")
        val hidden: DocumentVisibilityState

        @JsValue("visible")
        val visible: DocumentVisibilityState
    }
}
