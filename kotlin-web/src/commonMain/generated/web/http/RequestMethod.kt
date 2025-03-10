// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.http

import seskar.js.JsValue

sealed external interface RequestMethod {
    companion object {
        @JsValue("DELETE")
        val DELETE: RequestMethod

        @JsValue("GET")
        val GET: RequestMethod

        @JsValue("HEAD")
        val HEAD: RequestMethod

        @JsValue("OPTIONS")
        val OPTIONS: RequestMethod

        @JsValue("PATCH")
        val PATCH: RequestMethod

        @JsValue("POST")
        val POST: RequestMethod

        @JsValue("PUT")
        val PUT: RequestMethod
    }
}
