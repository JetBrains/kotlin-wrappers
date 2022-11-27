// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface UnparsedSource : Node {
    override val kind: SyntaxKind.UnparsedSource
    var fileName: String
    var text: String
    val prologues: ReadonlyArray<UnparsedPrologue>
    var helpers: ReadonlyArray<UnscopedEmitHelper>?
    var referencedFiles: ReadonlyArray<FileReference>
    var typeReferenceDirectives: ReadonlyArray<FileReference>?
    var libReferenceDirectives: ReadonlyArray<FileReference>
    var hasNoDefaultLib: Boolean?
    var sourceMapPath: String?
    var sourceMapText: String?
    val syntheticReferences: ReadonlyArray<UnparsedSyntheticReference>?
    val texts: ReadonlyArray<UnparsedSourceText>
}
