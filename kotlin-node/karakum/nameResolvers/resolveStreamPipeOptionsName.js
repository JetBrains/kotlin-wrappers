import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("stream.d.ts")) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
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
    if (method.name.text !== "pipe") return null

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null
    if (classNode.name.text !== "internal") return null

    return "StreamPipeOptions"
}
