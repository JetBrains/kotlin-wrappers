// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Starts a new lexical environment and visits a parameter list, suspending the lexical
 * environment upon completion.
 */
external fun visitParameterList(
    nodes: NodeArray<ParameterDeclaration>,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: NodesVisitor = definedExternally,
): NodeArray<ParameterDeclaration>

external fun visitParameterList(
    nodes: NodeArray<ParameterDeclaration>?,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: NodesVisitor = definedExternally,
): NodeArray<ParameterDeclaration>?
