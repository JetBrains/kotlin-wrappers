// Automatically generated - do not modify!

package typescript.ast

external interface JSDocCallbackTag :
    JSDocTag,
    NamedDeclaration,
    LocalsContainer,
    DeclarationWithTypeParameters {
    override val kind: SyntaxKind.JSDocCallbackTag
    override val parent: JSDoc?
    val fullName: (JSDocCallbackTagFullName)?
    override val name: Identifier?
    val typeExpression: JSDocSignature
}
