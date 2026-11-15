// Automatically generated - do not modify!

package typescript.ast

external interface JsxAttribute :
    Declaration,
    HasInitializer,
    VariableLikeDeclaration,
    JsxAttributeLike {
    override val kind: SyntaxKind.JsxAttribute
    override val parent: JsxAttributes?
    val name: JsxAttributeName
    val initializer: JsxAttributeValue?
}
