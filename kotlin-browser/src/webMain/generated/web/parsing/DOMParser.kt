// Automatically generated - do not modify!

package web.parsing

import web.dom.Document
import web.trustedtypes.TrustedHTML

/**
 * The **`DOMParser`** interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser)
 */
open external class DOMParser {
    /**
     * The **`parseFromString()`** method of the DOMParser interface parses an input containing either HTML or XML, returning a Document with the type given in the contentType property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser/parseFromString)
     */
    fun parseFromString(
        string: TrustedHTML,
        type: DOMParserSupportedType,
    ): Document

    fun parseFromString(
        string: String,
        type: DOMParserSupportedType,
    ): Document
}
