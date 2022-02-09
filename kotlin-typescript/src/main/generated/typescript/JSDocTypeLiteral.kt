// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface JSDocTypeLiteral : JSDocType, Union.JSDocTypeLiteral_ {
    override val kind: SyntaxKind.JSDocTypeLiteral
    val jsDocPropertyTags: ReadonlyArray<JSDocPropertyLikeTag>?

    /** If true, then this type literal represents an *array* of its type. */
    val isArrayType: Boolean
}
