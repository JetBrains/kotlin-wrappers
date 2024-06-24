// Automatically generated - do not modify!

package typescript

sealed external interface Identifier : PrimaryExpression, Declaration, JSDocContainer, FlowContainer, HasJSDoc,
    EntityName, PropertyName, MemberName, DeclarationStatementName, BindingName, TypePredicateNodeParameterName,
    PropertyNameLiteral, BindingOrAssignmentElementTarget, EntityNameExpression, JsxAttributeName, JsxTagNameExpression,
    JsxTagNamePropertyAccessExpression, ModuleName, JSDocNamespaceBody, ImportAttributeName,
    JSDocAugmentsTagClassExpression, JSDocImplementsTagClassExpression, JSDocTypedefTagFullName,
    JSDocCallbackTagFullName, IsIdentifierOrThisTypeNodeResultPredicate {
    override val kind: SyntaxKind.Identifier

    /**
     * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
     * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
     */
    val escapedText: __String
    val text: String

    /** @deprecated Use `idKeyword(identifier)` instead. */
    val originalKeywordKind: SyntaxKind?

    /** @deprecated Use `.parent` or the surrounding context to determine this instead. */
    val isInJSDocNamespace: Boolean?
}
