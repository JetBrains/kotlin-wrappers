// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextOverflow {
    companion object {
        @JsValue("clip")
        val clip: TextOverflow

        @JsValue("ellipsis")
        val ellipsis: TextOverflow
    }
}
