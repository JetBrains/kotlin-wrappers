// Automatically generated - do not modify!

package typescript

/**
 * This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
 * ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
 * JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
 * ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)
 */
sealed external interface ObjectLiteralExpressionBase<T : ObjectLiteralElement> : PrimaryExpression, Declaration {
    val properties: NodeArray<T>
}
