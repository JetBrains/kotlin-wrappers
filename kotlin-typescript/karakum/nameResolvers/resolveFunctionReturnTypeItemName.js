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

    let functionNode = getParent(arrayType)
    if (ts.isTypeOperatorNode(functionNode)) {
        functionNode = getParent(functionNode)
    }
    if (!functionNode) return null
    if (!ts.isFunctionDeclaration(functionNode)) return null
    if (functionNode.name === undefined) return null
    if (
        functionNode.type !== arrayType
        && functionNode.type !== arrayType.parent
    ) return null

    const parentName = functionNode.name.text

    return `${karakum.capitalize(parentName)}ResultItem`
}
