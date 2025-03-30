// Automatically generated - do not modify!

package typescript

sealed external interface ConstructorTypeNode : FunctionOrConstructorTypeNodeBase, LocalsContainer, HasJSDoc,
    HasModifiers, SignatureDeclaration, FunctionOrConstructorTypeNode, IsFunctionOrConstructorTypeNodeResultPredicate {
    override val kind: SyntaxKind.ConstructorType
    val modifiers: NodeArray<Modifier>?
}
