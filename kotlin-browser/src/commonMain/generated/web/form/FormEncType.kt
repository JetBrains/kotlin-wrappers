// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
