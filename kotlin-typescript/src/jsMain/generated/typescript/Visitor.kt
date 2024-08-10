// Automatically generated - do not modify!

package typescript

/**
 * A function that accepts and possibly transforms a node.
 */
typealias Visitor<
        TIn, /*  : Node default is Node */
        @Suppress("UNUSED_TYPEALIAS_PARAMETER")
        TOut,
        /*  : Node? default is TIn? */
        > = (node: TIn) -> VisitResult<TOut>
