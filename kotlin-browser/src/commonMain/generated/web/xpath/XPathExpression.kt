// Automatically generated - do not modify!

package web.xpath

import web.dom.Node
import kotlin.js.definedExternally

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information from its DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression)
 */
open external class XPathExpression
private constructor() {
    /**
     * The **`evaluate()`** method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression/evaluate)
     */
    fun evaluate(
        contextNode: Node,
        type: Short = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult
}
