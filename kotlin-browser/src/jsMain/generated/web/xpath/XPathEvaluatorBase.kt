// Automatically generated - do not modify!

package web.xpath

import web.dom.Node

external interface XPathEvaluatorBase {
    fun createExpression(
        expression: String,
        resolver: XPathNSResolver? = definedExternally,
    ): XPathExpression

    fun createNSResolver(nodeResolver: Node): Node
    fun evaluate(
        expression: String,
        contextNode: Node,
        resolver: XPathNSResolver? = definedExternally,
        type: Number = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult
}
