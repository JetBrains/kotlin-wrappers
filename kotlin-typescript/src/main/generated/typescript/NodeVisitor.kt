// Automatically generated - do not modify!

package typescript

sealed external interface NodeVisitor {
    fun <T : Node> /* native */ invoke(
        nodes: T,
        visitor: Visitor?,
        test: (node: Node) -> Boolean = definedExternally,
        lift: (node: ReadonlyArray<Node>) -> T = definedExternally,
    ): T

    fun <T : Node> /* native */ invoke(
        nodes: T?,
        visitor: Visitor?,
        test: (node: Node) -> Boolean = definedExternally,
        lift: (node: ReadonlyArray<Node>) -> T = definedExternally,
    ): T?
}
