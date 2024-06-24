// Automatically generated - do not modify!

package typescript

/** @deprecated */
sealed external interface UnparsedSource : Node, BundlePrependsItem, NodeFactoryCreateBundlePrependsItem,
    NodeFactoryUpdateBundlePrependsItem {
    override val kind: SyntaxKind.UnparsedSource
    var fileName: String
    var text: String
    val prologues: js.array.ReadonlyArray<UnparsedPrologue>
    var helpers: (js.array.ReadonlyArray<UnscopedEmitHelper>)?
    var referencedFiles: js.array.ReadonlyArray<FileReference>
    var typeReferenceDirectives: (js.array.ReadonlyArray<FileReference>)?
    var libReferenceDirectives: js.array.ReadonlyArray<FileReference>
    var hasNoDefaultLib: Boolean?
    var sourceMapPath: String?
    var sourceMapText: String?
    val syntheticReferences: (js.array.ReadonlyArray<UnparsedSyntheticReference>)?
    val texts: js.array.ReadonlyArray<UnparsedSourceText>
}
