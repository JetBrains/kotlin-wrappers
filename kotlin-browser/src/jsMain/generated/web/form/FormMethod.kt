// Automatically generated - do not modify!

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
