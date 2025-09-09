package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isArrayTypeNode
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isTypeOperatorNode

fun resolveInterfaceMethodParameterItemName(node: Node, context: Context) = nullable {
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

    val parameter = ensureNotNull(
        typeScriptService.getParent(arrayType)
            ?.let {
                if (isTypeOperatorNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text

    val method = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isMethodSignature(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = ensureNotNull(interfaceNode.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}Item"
}
