// Automatically generated - do not modify!

package typescript

/**
 * One of:
 * - import x = require("mod");
 * - import x = M.x;
 */
external interface ImportEqualsDeclaration : DeclarationStatement, JSDocContainer {
    override val kind: SyntaxKind.ImportEqualsDeclaration
    override val parent: dynamic /* SourceFile | ModuleBlock */
    override val name: Identifier
    val isTypeOnly: Boolean
    val moduleReference: ModuleReference
}
