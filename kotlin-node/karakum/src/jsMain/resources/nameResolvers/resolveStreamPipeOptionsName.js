import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("stream.d.ts")) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const parameter = getParent(node)
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null
    if (parameter.name.text !== "options") return null

    const method = getParent(parameter)
    if (!method) return null
    if (!ts.isMethodDeclaration(method)) return null
    if (!ts.isIdentifier(method.name)) return null
    if (
        method.name.text !== "pipe"
        && method.name.text !== "compose"
    ) {
        return null
    }

    const methodName = method.name.text

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null
    if (classNode.name.text !== "internal") return null

    return `Stream${karakum.capitalize(methodName)}Options`
}
