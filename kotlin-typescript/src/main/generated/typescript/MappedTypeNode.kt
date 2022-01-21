// Automatically generated - do not modify!

package typescript

external interface MappedTypeNode : TypeNode, Declaration {
    override val kind: SyntaxKind.MappedType
    val readonlyToken: dynamic /* ReadonlyToken | PlusToken | MinusToken */
    val typeParameter: TypeParameterDeclaration
    val nameType: TypeNode?
    val questionToken: dynamic /* QuestionToken | PlusToken | MinusToken */
    val type: TypeNode?

    /** Used only to produce grammar errors */
    val members: NodeArray<TypeElement>?
}
