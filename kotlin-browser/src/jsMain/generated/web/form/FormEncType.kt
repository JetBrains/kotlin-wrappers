// Automatically generated - do not modify!

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
