// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
