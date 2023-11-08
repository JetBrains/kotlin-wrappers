// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface UserSelect {
    companion object {
        @JsValue("all")
        val all: UserSelect

        @JsValue("contain")
        val contain: UserSelect

        @JsValue("element")
        val element: UserSelect

        @JsValue("text")
        val text: UserSelect
    }
}
