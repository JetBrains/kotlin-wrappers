// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
 *
 * @param node The Node whose children will be visited.
 * @param visitor The callback used to visit each child.
 * @param context A lexical environment context for the visitor.
 */
external fun <T : Node> visitEachChild(
    node: T,
    visitor: Visitor,
    context: TransformationContext,
): T

/**
 * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
 *
 * @param node The Node whose children will be visited.
 * @param visitor The callback used to visit each child.
 * @param context A lexical environment context for the visitor.
 */
external fun <T : Node> visitEachChild(
    node: T?,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: dynamic /* typeof visitNodes */ = definedExternally,
    tokenVisitor: Visitor = definedExternally,
): T?
