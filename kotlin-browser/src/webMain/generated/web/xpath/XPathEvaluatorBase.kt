// Automatically generated - do not modify!

package web.xpath

import js.internal.InternalApi
import web.dom.Node

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface XPathEvaluatorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    fun createExpression(
        expression: String,
        resolver: XPathNSResolver? = definedExternally,
    ): XPathExpression

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    fun evaluate(
        expression: String,
        contextNode: Node,
        resolver: XPathNSResolver? = definedExternally,
        type: Short = definedExternally,
        result: XPathResult? = definedExternally,
    ): XPathResult
}
