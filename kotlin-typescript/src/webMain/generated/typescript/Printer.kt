// Automatically generated - do not modify!

package typescript

external interface Printer {
    /**
     * Print a node and its subtree as-is, without any emit transformations.
     * @param hint A value indicating the purpose of a node. This is primarily used to
     * distinguish between an `Identifier` used in an expression position, versus an
     * `Identifier` used as an `IdentifierName` as part of a declaration. For most nodes you
     * should just pass `Unspecified`.
     * @param node The node to print. The node and its subtree are printed as-is, without any
     * emit transformations.
     * @param sourceFile A source file that provides context for the node. The source text of
     * the file is used to emit the original source content for literals and identifiers, while
     * the identifiers of the source file are used when generating unique names to avoid
     * collisions.
     */
    fun printNode(
        hint: EmitHint,
        node: Node,
        sourceFile: SourceFile,
    ): String

    /**
     * Prints a list of nodes using the given format flags
     */
    fun <T : Node> printList(
        format: ListFormat,
        list: NodeArray<T>,
        sourceFile: SourceFile,
    ): String

    /**
     * Prints a source file as-is, without any emit transformations.
     */
    fun printFile(sourceFile: SourceFile): String

    /**
     * Prints a bundle of source files as-is, without any emit transformations.
     */
    fun printBundle(bundle: Bundle): String
}
