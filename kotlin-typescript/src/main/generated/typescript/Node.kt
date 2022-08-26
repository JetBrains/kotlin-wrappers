// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface Node : ReadonlyTextRange {
    val kind: SyntaxKind
    val flags: NodeFlags
    val parent: Node
    fun getSourceFile(): SourceFile
    fun getChildCount(sourceFile: SourceFile = definedExternally): Int
    fun getChildAt(
        index: Int,
        sourceFile: SourceFile = definedExternally,
    ): Node

    fun getChildren(sourceFile: SourceFile = definedExternally): ReadonlyArray<Node>
    fun getStart(
        sourceFile: SourceFile = definedExternally,
        includeJsDocComment: Boolean = definedExternally,
    ): Int

    fun getFullStart(): Int
    fun getEnd(): Int
    fun getWidth(sourceFile: SourceFileLike = definedExternally): Int
    fun getFullWidth(): Int
    fun getLeadingTriviaWidth(sourceFile: SourceFile = definedExternally): Int
    fun getFullText(sourceFile: SourceFile = definedExternally): String
    fun getText(sourceFile: SourceFile = definedExternally): String
    fun getFirstToken(sourceFile: SourceFile = definedExternally): Node?
    fun getLastToken(sourceFile: SourceFile = definedExternally): Node?
    fun <T> forEachChild(
        cbNode: (node: Node) -> T?,
        cbNodeArray: (nodes: NodeArray<Node>) -> T? = definedExternally,
    ): T?


}
