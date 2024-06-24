import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    let arrayType = getParent(node)
    if (ts.isParenthesizedTypeNode(arrayType)) {
        arrayType = getParent(arrayType)
    }
    if (!arrayType) return null
    if (!ts.isArrayTypeNode(arrayType)) return null

    let parameter = getParent(arrayType)
    if (ts.isTypeOperatorNode(parameter)) {
        parameter = getParent(parameter)
    }
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text

    const method = getParent(parameter)
    if (!method) return null
    if (!ts.isMethodSignature(method)) return null
    if (!ts.isIdentifier(method.name)) return null

    const methodName = method.name.text

    const interfaceNode = getParent(method)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}${karakum.capitalize(parameterName)}Item`
}
