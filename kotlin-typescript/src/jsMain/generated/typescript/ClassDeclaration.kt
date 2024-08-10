// Automatically generated - do not modify!

package typescript

sealed external interface ClassDeclaration : ClassLikeDeclarationBase, DeclarationStatement, HasDecorators,
    HasModifiers, ClassStaticBlockDeclarationParent, ClassLikeDeclaration {
    override val kind: SyntaxKind.ClassDeclaration
    val modifiers: NodeArray<ModifierLike>?

    /** May be undefined in `export default class { ... }`. */
    override val name: Identifier?
}
