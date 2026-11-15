// Automatically generated - do not modify!

package typescript.ast

/** Brand for a PropertyAccessExpression which, like a QualifiedName, consists of a sequence of identifiers separated by dots. */
external interface PropertyAccessEntityNameExpression :
    PropertyAccessExpression,
    EntityNameExpression,
    JSDocAugmentsTagClassExpression,
    JSDocImplementsTagClassExpression {
    override val expression: EntityNameExpression
    override val name: Identifier
}
