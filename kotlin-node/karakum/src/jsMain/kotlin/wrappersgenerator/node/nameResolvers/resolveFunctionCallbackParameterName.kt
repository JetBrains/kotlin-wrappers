package wrappersgenerator.node.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveFunctionCallbackParameterName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val callbackParameter = ensureNotNull(typeScriptService.getParent(node))
    ensure(isParameter(callbackParameter))

    val callbackParameterNameNode = callbackParameter.name
    ensure(isIdentifier(callbackParameterNameNode))
    val callbackParameterName = callbackParameterNameNode.text

    val functionType = ensureNotNull(typeScriptService.getParent(callbackParameter))
    ensure(isFunctionTypeNode(functionType))

    val parameter = ensureNotNull(typeScriptService.getParent(functionType))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text

    val function = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isFunctionDeclaration(function))
    val parentName = ensureNotNull(function.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}${callbackParameterName.replaceFirstChar { it.titlecase() }}"
}
