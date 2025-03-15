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
    if (!ts.isMethodDeclaration(method)) return null
    if (!ts.isIdentifier(method.name)) return null

    let methodName = method.name.text
    if (methodName === "_writev") {
        methodName = "writev"
    }

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null

    let parentName = classNode.name.text
    if (
        parentName === "WritableBase"
        || parentName === "Duplex"
    ) {
        parentName = "Writable"
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}${karakum.capitalize(parameterName)}Item`
}
