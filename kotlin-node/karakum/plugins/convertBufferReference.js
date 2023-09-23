import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Buffer"
            || node.typeName.text === "BufferEncoding"
        )
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(node.typeName)
        if (!symbol) return null

        const [declaration] = symbol.declarations ?? []
        if (!declaration) return null

        const sourceFileName = declaration.getSourceFile()?.fileName ?? "generated.d.ts"
        if (!sourceFileName.endsWith("buffer.d.ts")) return null

        return `node.buffer.${render(node)}`
    }


    return null
}
