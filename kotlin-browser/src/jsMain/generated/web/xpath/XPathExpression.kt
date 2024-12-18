// Automatically generated - do not modify!

package web.xpath

import web.dom.Node

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression)
 */
external class XPathExpression
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression/evaluate)
     */
    fun evaluate(
        contextNode: Node,
        type: UShort = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult
}
