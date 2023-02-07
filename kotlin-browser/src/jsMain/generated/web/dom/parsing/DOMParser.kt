// Automatically generated - do not modify!

package web.dom.parsing

import web.dom.Document

external class DOMParser {
    /**
     * Parses string using either the HTML or XML parser, according to type, and returns the resulting Document. type can be "text/html" (which will invoke the HTML parser), or any of "text/xml", "application/xml", "application/xhtml+xml", or "image/svg+xml" (which will invoke the XML parser).
     *
     * For the XML parser, if string cannot be parsed, then the returned Document will contain elements describing the resulting error.
     *
     * Note that script elements are not evaluated during parsing, and the resulting document's encoding will always be UTF-8.
     *
     * Values other than the above for type will cause a TypeError exception to be thrown.
     */
    fun parseFromString(
        string: String,
        type: DOMParserSupportedType,
    ): Document
}
