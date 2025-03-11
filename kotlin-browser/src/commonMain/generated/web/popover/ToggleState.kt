// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.popover

import seskar.js.JsValue

sealed external interface ToggleState {
    companion object {
        @JsValue("open")
        val open: ToggleState

        @JsValue("closed")
        val closed: ToggleState
    }
}
