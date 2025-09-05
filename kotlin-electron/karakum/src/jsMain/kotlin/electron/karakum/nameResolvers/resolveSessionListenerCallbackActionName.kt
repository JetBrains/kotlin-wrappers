package electron.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.camelize
import io.github.sgrishchenko.karakum.util.identifier
import typescript.Node
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isFunctionTypeNode
import typescript.isIdentifier
import typescript.isLiteralTypeNode
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isStringLiteral

fun resolveSessionListenerCallbackActionName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val callbackParameterCallbackParameter = ensureNotNull(typeScriptService.getParent(node))
    ensure(isParameter(callbackParameterCallbackParameter))

    val callbackParameterCallbackParameterNameNode = callbackParameterCallbackParameter.name
    ensure(isIdentifier(callbackParameterCallbackParameterNameNode))
    ensure(callbackParameterCallbackParameterNameNode.text == "action")
    val callbackParameterCallbackParameterName = callbackParameterCallbackParameterNameNode.text

    val callbackParameterType = ensureNotNull(typeScriptService.getParent(callbackParameterCallbackParameter))
    ensure(isFunctionTypeNode(callbackParameterType))

    val callbackParameter = ensureNotNull(typeScriptService.getParent(callbackParameterType))
    ensure(isParameter(callbackParameter))

    val callbackParameterNameNode = callbackParameter.name
    ensure(isIdentifier(callbackParameterNameNode))
    ensure(callbackParameterNameNode.text == "callback")
    val callbackParameterName = callbackParameterNameNode.text

    val functionType = ensureNotNull(typeScriptService.getParent(callbackParameter))
    ensure(isFunctionTypeNode(functionType))

    val parameter = ensureNotNull(typeScriptService.getParent(functionType))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    ensure(parameterNameNode.text == "listener")
    val parameterName = parameterNameNode.text

    val method = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isMethodDeclaration(method))

    val eventType = ensureNotNull(method.parameters.asArray().firstOrNull()?.type)
    ensure(isLiteralTypeNode(eventType))

    val eventTypeLiteral = eventType.literal
    ensure(isStringLiteral(eventTypeLiteral))
    val eventName = camelize(eventTypeLiteral.text)

    val classNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isClassDeclaration(classNode))
    ensure(classNode.name?.text == "Session")
    val parentName = ensureNotNull(classNode.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${eventName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}${callbackParameterName.replaceFirstChar { it.titlecase() }}${callbackParameterCallbackParameterName.replaceFirstChar { it.titlecase() }}"
}
