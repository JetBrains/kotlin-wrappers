// Automatically generated - do not modify!

package typescript

import typescript.ast.visitor.TransformationContext

/**
 * A function that is used to initialize and return a `Transformer` callback, which in turn
 * will be used to transform one or more nodes.
 */
typealias TransformerFactory<T /*  : Node */> = (context: TransformationContext) -> Transformer<T>
