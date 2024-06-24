// Automatically generated - do not modify!

package typescript

sealed external interface TypeParameterDeclaration : NamedDeclaration, JSDocContainer, HasJSDoc, HasModifiers {
    override val kind: SyntaxKind.TypeParameter
    override val parent: TypeParameterDeclarationParent
    val modifiers: NodeArray<Modifier>?
    override val name: Identifier

    /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
    val constraint: TypeNode?
    val default: TypeNode?
    var expression: Expression?
}
