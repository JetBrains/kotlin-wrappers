package semver.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private val comparisonResultType = listOf("1", "0", "-1")

val convertComparisonResultType = createPlugin { node, context, _ ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        ensure(isUnionTypeNode(node))
        ensure(node.types.asArray().all { type ->
            nullable {
                ensure(isLiteralTypeNode(type))

                val literal = type.literal

                nullable {
                    ensure(isNumericLiteral(literal))
                } ?: nullable {
                    ensure(isPrefixUnaryExpression(literal))

                    val operand = literal.operand
                    ensure(isNumericLiteral(operand))
                }
            } != null
        })

        val printedTypes = node.types.asArray().map { typeScriptService.printNode(it) }
        ensure(printedTypes == comparisonResultType)

        val parent = ensureNotNull(node.getParentOrNull())

        val name = ensureNotNull(
            nullable {
                ensure(isFunctionDeclaration(parent))

                parent.name
            } ?: nullable {
                ensure(isMethodDeclaration(parent))

                val methodName = parent.name
                ensure(isIdentifier(methodName))

                methodName
            }
        )
        ensure(
            name.text.startsWith("compare")
                    || name.text.startsWith("rcompare")
        )

        "Int"
    }
}
