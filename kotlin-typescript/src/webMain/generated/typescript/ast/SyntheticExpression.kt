// Automatically generated - do not modify!

package typescript.ast

import typescript.sync.Type

external interface SyntheticExpression : Expression {
    override val kind: SyntaxKind.SyntheticExpression
    val isSpread: Boolean
    val type: Type
    val tupleNameSource: (SyntheticExpressionTupleNameSource)?
}
