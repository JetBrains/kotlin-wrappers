package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isArrayTypeNode
import typescript.isFunctionDeclaration
import typescript.isParenthesizedTypeNode
import typescript.isTypeOperatorNode

fun resolveFunctionReturnTypeItemName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val arrayType = ensureNotNull(
        typeScriptService.getParent(node)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isArrayTypeNode(arrayType))

    val function = ensureNotNull(
        typeScriptService.getParent(arrayType)
            ?.let {
                if (isTypeOperatorNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isFunctionDeclaration(function))
    ensure(
        function.type == arrayType
                || function.type == arrayType.parent
    )
    val parentName = ensureNotNull(function.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}ResultItem"
}
