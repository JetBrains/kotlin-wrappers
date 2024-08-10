// Automatically generated - do not modify!

package typescript

/** @deprecated */
sealed external interface UnparsedPrepend : UnparsedSection, UnparsedSourceText {
    override val kind: SyntaxKind.UnparsedPrepend
    override val parent: UnparsedSource
    override val data: String
    val texts: js.array.ReadonlyArray<UnparsedTextLike>
}
