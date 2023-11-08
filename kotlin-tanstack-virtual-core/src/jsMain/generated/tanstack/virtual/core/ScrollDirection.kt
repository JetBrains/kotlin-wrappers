// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.virtual.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScrollDirection {
    companion object {
        @JsValue("forward")
        val forward: ScrollDirection

        @JsValue("backward")
        val backward: ScrollDirection
    }
}
