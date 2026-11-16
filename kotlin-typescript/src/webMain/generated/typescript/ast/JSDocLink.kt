// Automatically generated - do not modify!

package typescript.ast

external interface JSDocLink :
    Node,
    JSDocComment,
    IsJSDocLinkLikeResultPredicate {
    override val kind: SyntaxKind.JSDocLink
    val name: (JSDocLinkName)?
    var text: String
}
