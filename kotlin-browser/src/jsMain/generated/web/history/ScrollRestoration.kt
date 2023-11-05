// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ScrollRestoration {
    companion object {
        @JsValue("auto")
        val auto: ScrollRestoration

        @JsValue("manual")
        val manual: ScrollRestoration
    }
}
