// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ShadowRootMode {
    companion object {
        @JsValue("closed")
        val closed: ShadowRootMode

        @JsValue("open")
        val open: ShadowRootMode
    }
}
