// Automatically generated - do not modify!

package web.parsing

import web.dom.Node

/**
 * The `XMLSerializer` interface provides the XMLSerializer.serializeToString method to construct an XML string representing a DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer)
 */
open external class XMLSerializer {
    /**
     * The XMLSerializer method **`serializeToString()`** constructs a string representing the specified DOM tree in XML form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer/serializeToString)
     */
    fun serializeToString(root: Node): String
}
