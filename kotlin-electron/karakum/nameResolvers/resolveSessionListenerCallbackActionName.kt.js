import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const callbackParameterCallbackParameter = getParent(node)
    if (!callbackParameterCallbackParameter) return null
    if (!ts.isParameter(callbackParameterCallbackParameter)) return null
    if (!ts.isIdentifier(callbackParameterCallbackParameter.name)) return null

    const callbackParameterCallbackParameterName = callbackParameterCallbackParameter.name.text
    if (callbackParameterCallbackParameterName !== "action") return null

    const callbackParameterType = getParent(callbackParameterCallbackParameter)
    if (!callbackParameterType) return null
    if (!ts.isFunctionTypeNode(callbackParameterType)) return null

    const callbackParameter = getParent(callbackParameterType)
    if (!callbackParameter) return null
    if (!ts.isParameter(callbackParameter)) return null
    if (!ts.isIdentifier(callbackParameter.name)) return null

    const callbackParameterName = callbackParameter.name.text
    if (callbackParameterName !== "callback") return null

    const functionType = getParent(callbackParameter)
    if (!functionType) return null
    if (!ts.isFunctionTypeNode(functionType)) return null

    const parameter = getParent(functionType)
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text
    if (parameterName !== "listener") return null

    const method = getParent(parameter)
    if (!method) return null
    if (!ts.isMethodDeclaration(method)) return null
    if (!ts.isIdentifier(method.name)) return null

    const eventType = method.parameters[0]?.type
    if (!eventType) return null
    if (!ts.isLiteralTypeNode(eventType)) return null
    if (!ts.isStringLiteral(eventType.literal)) return null

    const eventName = karakum.identifier(eventType.literal.text)

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null

    const parentName = classNode.name.text
    if (parentName !== "Session") return null

    return `${karakum.capitalize(parentName)}${karakum.capitalize(eventName)}${karakum.capitalize(parameterName)}${karakum.capitalize(callbackParameterName)}${karakum.capitalize(callbackParameterCallbackParameterName)}`
}
