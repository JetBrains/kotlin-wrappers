// Automatically generated - do not modify!

package typescript

sealed external interface Bundle : Node {
    override val kind: SyntaxKind.Bundle
    val prepends: dynamic /* (InputFiles | UnparsedSource)[] */
    val sourceFiles: ReadonlyArray<SourceFile>
}
