// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue

sealed external interface SelectionDirection {
    companion object {
        @JsValue("forward")
        val forward: SelectionDirection

        @JsValue("backward")
        val backward: SelectionDirection

        @JsValue("none")
        val none: SelectionDirection
    }
}
