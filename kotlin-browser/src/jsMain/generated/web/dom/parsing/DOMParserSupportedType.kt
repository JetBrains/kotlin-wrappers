// Automatically generated - do not modify!

package web.dom.parsing

import seskar.js.JsValue

sealed external interface DOMParserSupportedType {
    companion object {
        @JsValue("application/xhtml+xml")
        val applicationXhtmlXml: DOMParserSupportedType

        @JsValue("application/xml")
        val applicationXml: DOMParserSupportedType

        @JsValue("image/svg+xml")
        val imageSvgXml: DOMParserSupportedType

        @JsValue("text/html")
        val textHtml: DOMParserSupportedType

        @JsValue("text/xml")
        val textXml: DOMParserSupportedType
    }
}
