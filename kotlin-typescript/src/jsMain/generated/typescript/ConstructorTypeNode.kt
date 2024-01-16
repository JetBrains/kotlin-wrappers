// Automatically generated - do not modify!

package typescript

sealed external interface ConstructorTypeNode : FunctionOrConstructorTypeNodeBase, LocalsContainer,
    Union.ConstructorTypeNode_ {
    override val kind: SyntaxKind.ConstructorType
    val modifiers: NodeArray<Modifier>?
}
