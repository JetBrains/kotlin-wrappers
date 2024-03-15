import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const callbackParameter = getParent(node)
    if (!callbackParameter) return null
    if (!ts.isParameter(callbackParameter)) return null
    if (!ts.isIdentifier(callbackParameter.name)) return null

    const callbackParameterName = callbackParameter.name.text

    const functionType = getParent(callbackParameter)
    if (!functionType) return null
    if (!ts.isFunctionTypeNode(functionType)) return null

    let union = getParent(functionType)
    if (ts.isParenthesizedTypeNode(union)) {
        union = getParent(union)
    }
    if (!union) return null
    if (!ts.isUnionTypeNode(union)) return null
    if (union.types.length < 2) return null

    let nullKeyword = union.types[1]
    if (ts.isParenthesizedTypeNode(nullKeyword)) {
        nullKeyword = nullKeyword.type
    }
    if (
        !ts.isLiteralTypeNode(nullKeyword)
        || nullKeyword.literal.kind !== ts.SyntaxKind.NullKeyword
    ) return null

    const parameter = getParent(union)
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text

    const method = getParent(parameter)
    if (!method) return null
    if (!ts.isMethodDeclaration(method)) return null
    if (!ts.isIdentifier(method.name)) return null

    const methodName = method.name.text

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null

    const parentName = classNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}${karakum.capitalize(parameterName)}${karakum.capitalize(callbackParameterName)}`
}
