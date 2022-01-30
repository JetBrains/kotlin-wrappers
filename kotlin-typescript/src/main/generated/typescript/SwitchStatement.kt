// Automatically generated - do not modify!

package typescript

sealed external interface SwitchStatement : Statement, Union.SwitchStatement_ {
    override val kind: SyntaxKind.SwitchStatement
    val expression: Expression
    val caseBlock: CaseBlock
    var possiblyExhaustive: Boolean?
}
