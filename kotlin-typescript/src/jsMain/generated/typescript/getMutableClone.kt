// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Creates a shallow, memberwise clone of a node ~for mutation~ with its `pos`, `end`, and `parent` set.
 *
 * NOTE: It is unsafe to change any properties of a `Node` that relate to its AST children, as those changes won't be
 * captured with respect to transformations.
 *
 * @deprecated Use an appropriate `factory.update...` method instead, use `setCommentRange` or `setSourceMapRange`, and avoid setting `parent`.
 */
external fun <T : Node> getMutableClone(node: T): T
