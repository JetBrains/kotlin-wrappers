// Automatically generated - do not modify!

package typescript

/**
 * One of:
 * - import x = require("mod");
 * - import x = M.x;
 */
sealed external interface ImportEqualsDeclaration : DeclarationStatement, JSDocContainer, HasJSDoc, HasModifiers,
    TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.ImportEqualsDeclaration
    override val parent: ImportEqualsDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier
    val isTypeOnly: Boolean
    val moduleReference: ModuleReference
}
