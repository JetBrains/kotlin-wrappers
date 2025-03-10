// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.form

import seskar.js.JsValue

sealed external interface FormMethod {
    companion object {
        @JsValue("get")
        val get: FormMethod

        @JsValue("dialog")
        val dialog: FormMethod

        @JsValue("post")
        val post: FormMethod
    }
}
