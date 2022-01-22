// Automatically generated - do not modify!

package typescript

external interface TypeParameterDeclaration : NamedDeclaration {
    override val kind: SyntaxKind.TypeParameter
    override val parent: dynamic /* DeclarationWithTypeParameterChildren | InferTypeNode */
    override val name: Identifier

    /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
    val constraint: TypeNode?
    val default: TypeNode?
    var expression: Expression?
}
