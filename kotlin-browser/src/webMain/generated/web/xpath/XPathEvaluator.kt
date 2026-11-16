// Automatically generated - do not modify!

package web.xpath

import web.dom.Node

/**
 * The **`XPathEvaluator`** interface allows you to compile and evaluate XPath expressions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator)
 */
open external class XPathEvaluator :
    XPathEvaluatorBase {

    /* `XPathEvaluatorBase` overrides */

    override fun createExpression(
        expression: String,
        resolver: XPathNSResolver?,
    ): XPathExpression

    override fun evaluate(
        expression: String,
        contextNode: Node,
        resolver: XPathNSResolver?,
        type: Short,
        result: XPathResult?,
    ): XPathResult
}
