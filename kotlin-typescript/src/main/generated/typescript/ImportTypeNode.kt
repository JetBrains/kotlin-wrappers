// Automatically generated - do not modify!

package typescript

sealed external interface ImportTypeNode : NodeWithTypeArguments {
    override val kind: SyntaxKind.ImportType
    val isTypeOf: Boolean
    val argument: TypeNode
    val qualifier: EntityName?
}
