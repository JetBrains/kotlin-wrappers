// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Visits the elements of a {@link CommaListExpression}.
 * @param visitor The visitor to use when visiting expressions whose result will not be discarded at runtime.
 * @param discardVisitor The visitor to use when visiting expressions whose result will be discarded at runtime. Defaults to {@link visitor}.
 */
external fun visitCommaListElements(
    elements: NodeArray<Expression>,
    visitor: Visitor<*, *>,
    discardVisitor: Visitor<*, *> = definedExternally,
): NodeArray<Expression>
