// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RequestMode {
    companion object {
        @JsValue("cors")
        val cors: RequestMode

        @JsValue("navigate")
        val navigate: RequestMode

        @JsValue("no-cors")
        val noCors: RequestMode

        @JsValue("same-origin")
        val sameOrigin: RequestMode
    }
}
