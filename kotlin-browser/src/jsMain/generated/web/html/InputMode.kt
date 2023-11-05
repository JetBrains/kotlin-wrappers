// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface InputMode {
    companion object {
        @JsValue("none")
        val none: InputMode

        @JsValue("text")
        val text: InputMode

        @JsValue("tel")
        val tel: InputMode

        @JsValue("url")
        val url: InputMode

        @JsValue("email")
        val email: InputMode

        @JsValue("numeric")
        val numeric: InputMode

        @JsValue("decimal")
        val decimal: InputMode

        @JsValue("search")
        val search: InputMode
    }
}
