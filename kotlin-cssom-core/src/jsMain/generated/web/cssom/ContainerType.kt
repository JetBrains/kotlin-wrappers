// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ContainerType {
    companion object {
        @JsValue("inline-size")
        val inlineSize: ContainerType

        @JsValue("normal")
        val normal: ContainerType

        @JsValue("size")
        val size: ContainerType
    }
}
