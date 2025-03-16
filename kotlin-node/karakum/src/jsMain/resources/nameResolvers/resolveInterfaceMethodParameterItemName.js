import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const typeReference = getParent(node)
    if (!typeReference) return null
    if (!ts.isTypeReferenceNode(typeReference)) return null
    if (!ts.isIdentifier(typeReference.typeName)) return null
    if (typeReference.typeName.text !== "Array") return null

    const parameter = getParent(typeReference)
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

    let parentName = interfaceNode.name.text
    if (parentName === "DuplexOptions") {
        parentName = "WritableOptions"
    }
    if (parentName === "TransformOptions") {
        parentName = "WritableOptions"
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}${karakum.capitalize(parameterName)}Item`
}
