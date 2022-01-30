// Automatically generated - do not modify!

package typescript

sealed external interface TypeParameterDeclaration : NamedDeclaration {
    override val kind: SyntaxKind.TypeParameter
    override val parent: Union.TypeParameterDeclaration_parent
    override val name: Identifier

    /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
    val constraint: TypeNode?
    val default: TypeNode?
    var expression: Expression?
}
