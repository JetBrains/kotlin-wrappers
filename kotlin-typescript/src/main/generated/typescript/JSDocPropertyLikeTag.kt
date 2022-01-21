// Automatically generated - do not modify!

package typescript

external interface JSDocPropertyLikeTag : JSDocTag, Declaration {
    override val parent: JSDoc
    val name: EntityName
    val typeExpression: JSDocTypeExpression?

    /** Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like */
    val isNameFirst: Boolean
    val isBracketed: Boolean
}
