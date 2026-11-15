// Automatically generated - do not modify!

package typescript.ast

external interface JSDocTypedefTag :
    JSDocTag,
    NamedDeclaration,
    LocalsContainer,
    DeclarationWithTypeParameters {
    override val kind: SyntaxKind.JSDocTypedefTag
    override val parent: JSDoc?
    val fullName: (JSDocTypedefTagFullName)?
    override val name: Identifier?
    val typeExpression: (JSDocTypedefTagTypeExpression)?
}
