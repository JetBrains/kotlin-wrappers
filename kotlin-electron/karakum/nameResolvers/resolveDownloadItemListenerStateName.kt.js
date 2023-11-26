import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const parenthesizedCallbackParameter = getParent(node)
    if (!parenthesizedCallbackParameter) return null
    if (!ts.isParenthesizedTypeNode(parenthesizedCallbackParameter)) return null

    const callbackParameter = getParent(parenthesizedCallbackParameter)
    if (!callbackParameter) return null
    if (!ts.isParameter(callbackParameter)) return null
    if (!ts.isIdentifier(callbackParameter.name)) return null

    const callbackParameterName = callbackParameter.name.text
    if (callbackParameterName !== "state") return null

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

    const eventName = eventType.literal.text

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null

    const parentName = classNode.name.text
    if (parentName !== "DownloadItem") return null

    return `${karakum.capitalize(parentName)}${karakum.capitalize(eventName)}${karakum.capitalize(parameterName)}${karakum.capitalize(callbackParameterName)}`
}
