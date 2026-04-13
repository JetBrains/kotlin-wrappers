// Automatically generated - do not modify!

package typescript

external interface QualifiedName :
    Node,
    FlowContainer,
    EntityName,
    IsPropertyAccessOrQualifiedNameResultPredicate {
    override val kind: SyntaxKind.QualifiedName
    val left: EntityName
    val right: Identifier
}
