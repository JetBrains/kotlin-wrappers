import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("buffer.d.ts")) return null

    const variable = getParent(node)
    if (!variable) return null
    if (!ts.isVariableDeclaration(variable)) return null
    if (!ts.isIdentifier(variable.name)) return null

    const variableName = variable.name.text
    if (variableName !== "constants") return null

    return `BufferConstants`
}
