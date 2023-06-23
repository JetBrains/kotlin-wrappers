// Automatically generated - do not modify!

package web.dom.parsing

import web.dom.Document

/**
 * Provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser)
 */
external class DOMParser {
    /**
     * Parses string using either the HTML or XML parser, according to type, and returns the resulting Document. type can be "text/html" (which will invoke the HTML parser), or any of "text/xml", "application/xml", "application/xhtml+xml", or "image/svg+xml" (which will invoke the XML parser).
     *
     * For the XML parser, if string cannot be parsed, then the returned Document will contain elements describing the resulting error.
     *
     * Note that script elements are not evaluated during parsing, and the resulting document's encoding will always be UTF-8.
     *
     * Values other than the above for type will cause a TypeError exception to be thrown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser/parseFromString)
     */
    fun parseFromString(
        string: String,
        type: DOMParserSupportedType,
    ): Document
}
