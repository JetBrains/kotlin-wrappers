import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    let parameter = getParent(node)
    if (ts.isUnionTypeNode(parameter)) {
        parameter = getParent(parameter)
    }

    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text
    if (parameterName !== "input") return null

    const constructor = getParent(parameter)
    if (!constructor) return null
    if (!ts.isConstructorDeclaration(constructor)) return null

    const classNode = getParent(constructor)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null

    const parentName = classNode.name.text
    if (parentName !== "MIMEType") return null

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
