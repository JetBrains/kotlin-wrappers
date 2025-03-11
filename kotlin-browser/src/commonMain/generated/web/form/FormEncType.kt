// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.form

import seskar.js.JsValue

sealed external interface FormEncType {
    companion object {
        @JsValue("application/x-www-form-urlencoded")
        val applicationXWwwFormUrlencoded: FormEncType

        @JsValue("multipart/form-data")
        val multipartFormData: FormEncType

        @JsValue("application/json")
        val applicationJson: FormEncType

        @JsValue("text/plain")
        val textPlain: FormEncType
    }
}
