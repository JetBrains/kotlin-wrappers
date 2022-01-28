// Automatically generated - do not modify!

package typescript

sealed external interface JSDocTypeLiteral : JSDocType {
    override val kind: SyntaxKind.JSDocTypeLiteral
    val jsDocPropertyTags: ReadonlyArray<JSDocPropertyLikeTag>?

    /** If true, then this type literal represents an *array* of its type. */
    val isArrayType: Boolean
}
