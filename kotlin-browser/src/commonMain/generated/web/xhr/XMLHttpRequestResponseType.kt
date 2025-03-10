// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.xhr

import seskar.js.JsValue

sealed external interface XMLHttpRequestResponseType {
    companion object {
        @JsValue("")
        val none: XMLHttpRequestResponseType

        @JsValue("arraybuffer")
        val arraybuffer: XMLHttpRequestResponseType

        @JsValue("blob")
        val blob: XMLHttpRequestResponseType

        @JsValue("document")
        val document: XMLHttpRequestResponseType

        @JsValue("json")
        val json: XMLHttpRequestResponseType

        @JsValue("text")
        val text: XMLHttpRequestResponseType
    }
}
