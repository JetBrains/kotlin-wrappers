// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TouchType {
    companion object {
        @JsValue("direct")
        val direct: TouchType

        @JsValue("stylus")
        val stylus: TouchType
    }
}
