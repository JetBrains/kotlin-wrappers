@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.buffer

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface EndingType {
    companion object {
        @JsValue("native")
        val native: EndingType

        @JsValue("transparent")
        val transparent: EndingType
    }
}
