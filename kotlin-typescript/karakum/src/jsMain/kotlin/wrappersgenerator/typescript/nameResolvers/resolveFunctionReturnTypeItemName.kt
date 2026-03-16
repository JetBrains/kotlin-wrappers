package wrappersgenerator.typescript.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveFunctionReturnTypeItemName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

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
