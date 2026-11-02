// Automatically generated - do not modify!

package typescript

external interface ImportTypeNode : NodeWithTypeArguments {
    override val kind: SyntaxKind.ImportType
    val isTypeOf: Boolean
    val argument: TypeNode

    val attributes: ImportAttributes?
    val qualifier: EntityName?
}
