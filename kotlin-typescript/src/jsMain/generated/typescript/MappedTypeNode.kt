// Automatically generated - do not modify!

package typescript

sealed external interface MappedTypeNode : TypeNode, Declaration, LocalsContainer, HasType {
    override val kind: SyntaxKind.MappedType
    val readonlyToken: (MappedTypeNodeReadonlyToken)?
    val typeParameter: TypeParameterDeclaration
    val nameType: TypeNode?
    val questionToken: (MappedTypeNodeQuestionToken)?
    val type: TypeNode?

    /** Used only to produce grammar errors */
    val members: NodeArray<TypeElement>?
}
