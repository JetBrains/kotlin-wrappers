// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.virtual.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ScrollDirection {
    companion object {
        @JsValue("forward")
        val forward: ScrollDirection

        @JsValue("backward")
        val backward: ScrollDirection
    }
}
