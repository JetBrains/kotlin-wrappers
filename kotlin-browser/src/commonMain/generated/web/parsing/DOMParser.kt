// Automatically generated - do not modify!

package web.parsing

import web.dom.Document

/**
 * The **`DOMParser`** interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser)
 */
open external class DOMParser {
    /**
     * The **`parseFromString()`** method of the DOMParser interface parses a string containing either HTML or XML, returning an HTMLDocument or an XMLDocument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser/parseFromString)
     */
    fun parseFromString(
        string: String,
        type: DOMParserSupportedType,
    ): Document
}
