// Automatically generated - do not modify!

package web.xpath

import web.dom.Node

sealed external class XPathExpression {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression/evaluate) */
    fun evaluate(
        contextNode: Node,
        type: Number = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult
}
