// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.xpath

import web.dom.Node

external interface XPathEvaluatorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    fun createExpression(
        expression: String,
        resolver: XPathNSResolver? = definedExternally,
    ): XPathExpression = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver)
     */
    fun createNSResolver(nodeResolver: Node): Node = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    fun evaluate(
        expression: String,
        contextNode: Node,
        resolver: XPathNSResolver? = definedExternally,
        type: Number = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult = definedExternally
}
