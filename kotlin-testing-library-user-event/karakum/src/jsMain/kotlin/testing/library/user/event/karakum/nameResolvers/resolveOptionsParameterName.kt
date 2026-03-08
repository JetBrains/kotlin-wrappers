package testing.library.user.event.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

private fun isDirect(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val variable = ensureNotNull(typeScriptService.getParent(node))
    ensure(isVariableDeclaration(variable))

    val variableNameNode = variable.name
    ensure(isIdentifier(variableNameNode))
    ensure(variableNameNode.text == "userEvent")
} != null

fun resolveOptionsParameterName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val parameter = ensureNotNull(
        typeScriptService.getParent(node)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
            ?.let {
                if (isUnionTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    val parameterName = if (isIdentifier(parameterNameNode)) {
        parameterNameNode.text
    } else {
        "Options"
    }

    val functionType = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isFunctionTypeNode(functionType))

    val property = ensureNotNull(typeScriptService.getParent(functionType))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(property))
    ensure(isTypeLiteralNode(typeLiteral))

    val prefix = if (isDirect(typeLiteral, context)) {
        "Direct"
    } else {
        ""
    }

    "$prefix${propertyName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
}
