// Automatically generated - do not modify!

package typescript

sealed external interface Node : ReadonlyTextRange {
    val kind: SyntaxKind
    val flags: NodeFlags
    val parent: Node
    fun getSourceFile(): SourceFile
    fun getChildCount(sourceFile: SourceFile = definedExternally): Double
    fun getChildAt(index: Double, sourceFile: SourceFile = definedExternally): Node
    fun getChildren(sourceFile: SourceFile = definedExternally): js.array.ReadonlyArray<Node>
    fun getStart(sourceFile: SourceFile = definedExternally, includeJsDocComment: Boolean = definedExternally): Double
    fun getFullStart(): Double
    fun getEnd(): Double
    fun getWidth(sourceFile: SourceFileLike = definedExternally): Double
    fun getFullWidth(): Double
    fun getLeadingTriviaWidth(sourceFile: SourceFile = definedExternally): Double
    fun getFullText(sourceFile: SourceFile = definedExternally): String
    fun getText(sourceFile: SourceFile = definedExternally): String
    fun getFirstToken(sourceFile: SourceFile = definedExternally): Node?
    fun getLastToken(sourceFile: SourceFile = definedExternally): Node?
    fun <T> forEachChild(
        cbNode: (node: Node) -> T?,
        cbNodeArray: (nodes: NodeArray<Node>) -> T? = definedExternally,
    ): T?
}
