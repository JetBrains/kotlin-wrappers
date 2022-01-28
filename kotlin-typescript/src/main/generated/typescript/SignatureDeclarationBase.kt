// Automatically generated - do not modify!

package typescript

sealed external interface SignatureDeclarationBase : NamedDeclaration, JSDocContainer {
    override val kind: dynamic /* SignatureDeclaration["kind"] */
    override val name: PropertyName?
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val parameters: NodeArray<ParameterDeclaration>
    val type: TypeNode?
}
