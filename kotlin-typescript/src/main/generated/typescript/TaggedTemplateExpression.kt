// Automatically generated - do not modify!

package typescript

sealed external interface TaggedTemplateExpression : MemberExpression {
    override val kind: SyntaxKind.TaggedTemplateExpression
    val tag: LeftHandSideExpression
    val typeArguments: NodeArray<TypeNode>?
    val template: TemplateLiteral
}
