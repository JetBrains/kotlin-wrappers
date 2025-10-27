package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.SyntaxKind
import typescript.asArray
import typescript.isLiteralTypeNode
import typescript.isNumericLiteral
import typescript.isPrefixUnaryExpression
import typescript.isUnionTypeNode

val convertCompareResultType = createPlugin { node, context, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val types = node.types.asArray()

        ensure(types.size == 3)

        // -1
        val minusOne = ensureNotNull(types[0])
        ensure(isLiteralTypeNode(minusOne))
        val minusOneLiteral = minusOne.literal
        ensure(isPrefixUnaryExpression(minusOneLiteral))
        ensure(minusOneLiteral.operator == SyntaxKind.MinusToken)
        val minusOneLiteralOperand = minusOneLiteral.operand
        ensure(isNumericLiteral(minusOneLiteralOperand))
        ensure(minusOneLiteralOperand.text == "1")

        // 0
        val zero = ensureNotNull(types[1])
        ensure(isLiteralTypeNode(zero))
        val zeroLiteral = zero.literal
        ensure(isNumericLiteral(zeroLiteral))
        ensure(zeroLiteral.text == "0")

        // 1
        val one = ensureNotNull(types[2])
        ensure(isLiteralTypeNode(one))
        val oneLiteral = one.literal
        ensure(isNumericLiteral(oneLiteral))
        ensure(oneLiteral.text == "1")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        "Int /* ${typeScriptService.printNode(node)} */"
    }
}
