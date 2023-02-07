// Automatically generated - do not modify!

package typescript

sealed external interface ClassLikeDeclarationBase : NamedDeclaration, JSDocContainer {
    override val kind: Union.ClassLikeDeclarationBase_kind
    override val name: Identifier?
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val heritageClauses: NodeArray<HeritageClause>?
    val members: NodeArray<ClassElement>
}
