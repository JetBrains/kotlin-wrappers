// Automatically generated - do not modify!

package typescript

/**
 * A function that accepts and possibly transforms a node.
 */
typealias Visitor<TIn /* : Node */, TOut /* : Node? */> = (node: TIn) -> VisitResult<TOut>
