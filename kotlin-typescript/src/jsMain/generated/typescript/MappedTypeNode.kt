// Automatically generated - do not modify!

package typescript

sealed external interface MappedTypeNode : TypeNode, Declaration, Union.MappedTypeNode_ {
    override val kind: SyntaxKind.MappedType
    val readonlyToken: Union.MappedTypeNode_readonlyToken?
    val typeParameter: TypeParameterDeclaration
    val nameType: TypeNode?
    val questionToken: Union.MappedTypeNode_questionToken?
    val type: TypeNode?

    /** Used only to produce grammar errors */
    val members: NodeArray<TypeElement>?
}
