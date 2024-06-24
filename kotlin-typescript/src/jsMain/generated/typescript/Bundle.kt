// Automatically generated - do not modify!

package typescript

sealed external interface Bundle : Node {
    override val kind: SyntaxKind.Bundle

    /** @deprecated */
    val prepends: js.array.ReadonlyArray<(BundlePrependsItem)>
    val sourceFiles: js.array.ReadonlyArray<SourceFile>
}
