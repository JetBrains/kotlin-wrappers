// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FetchDirection {
    companion object {
        @JsValue("forward")
        val forward: FetchDirection

        @JsValue("backward")
        val backward: FetchDirection
    }
}
