import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("perf_hooks.d.ts")) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const parameterType = getParent(node)
    if (!parameterType) return null
    if (!ts.isUnionTypeNode(parameterType)) return null

    let infix = "Type"
    if (
        ts.isTypeLiteralNode(node)
        && node.members.some(member => (
            ts.isPropertySignature(member)
            && ts.isIdentifier(member.name)
            && member.name.text === "entryTypes"
        ))
    ) {
        infix = "Types"
    }

    const parameter = getParent(parameterType)
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null
    if (parameter.name.text !== "options") return null

    const method = getParent(parameter)
    if (!method) return null
    if (!ts.isMethodDeclaration(method)) return null
    if (!ts.isIdentifier(method.name)) return null
    if (method.name.text !== "observe") return null

    const classNode = getParent(method)
    if (!classNode) return null
    if (!ts.isClassDeclaration(classNode)) return null
    if (classNode.name === undefined) return null
    if (classNode.name.text !== "PerformanceObserver") return null

    return `PerformanceObserverObserve${infix}Options`
}
