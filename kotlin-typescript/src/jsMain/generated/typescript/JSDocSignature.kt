// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface JSDocSignature : JSDocType, Declaration, Union.JSDocSignature_ {
    override val kind: SyntaxKind.JSDocSignature
    val typeParameters: ReadonlyArray<JSDocTemplateTag>?
    val parameters: ReadonlyArray<JSDocParameterTag>
    val type: JSDocReturnTag?
}
