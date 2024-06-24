import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const typeParameter = getParent(node)
    if (!typeParameter) return null
    if (!ts.isTypeParameterDeclaration(typeParameter)) return null
    if (typeParameter.constraint !== node) return null

    const typeParameterName = typeParameter.name.text

    const method = getParent(typeParameter)
    if (!method) return null
    if (!ts.isMethodSignature(method)) return null
    if (!ts.isIdentifier(method.name)) return null

    const methodName = method.name.text

    const interfaceNode = getParent(method)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}${karakum.capitalize(typeParameterName)}Constraint`
}
