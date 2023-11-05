// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface InputType {
    companion object {
        @JsValue("button")
        val button: InputType

        @JsValue("checkbox")
        val checkbox: InputType

        @JsValue("color")
        val color: InputType

        @JsValue("date")
        val date: InputType

        @JsValue("datetime-local")
        val datetimeLocal: InputType

        @JsValue("email")
        val email: InputType

        @JsValue("file")
        val file: InputType

        @JsValue("hidden")
        val hidden: InputType

        @JsValue("image")
        val image: InputType

        @JsValue("month")
        val month: InputType

        @JsValue("number")
        val number: InputType

        @JsValue("password")
        val password: InputType

        @JsValue("radio")
        val radio: InputType

        @JsValue("range")
        val range: InputType

        @JsValue("reset")
        val reset: InputType

        @JsValue("search")
        val search: InputType

        @JsValue("submit")
        val submit: InputType

        @JsValue("tel")
        val tel: InputType

        @JsValue("text")
        val text: InputType

        @JsValue("time")
        val time: InputType

        @JsValue("url")
        val url: InputType

        @JsValue("week")
        val week: InputType
    }
}
