// Automatically generated - do not modify!

package typescript

/**
 * One of:
 * - import x = require("mod");
 * - import x = M.x;
 */
sealed external interface ImportEqualsDeclaration : DeclarationStatement, JSDocContainer,
    Union.ImportEqualsDeclaration_ {
    override val kind: SyntaxKind.ImportEqualsDeclaration
    override val parent: Union.ImportEqualsDeclaration_parent
    val modifiers: NodeArray<Modifier>?
    override val name: Identifier
    val isTypeOnly: Boolean
    val moduleReference: ModuleReference
}
