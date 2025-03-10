import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Buffer"
            || node.typeName.text === "BufferEncoding"
        )
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(node.typeName)
        if (!symbol) return null

        const declarations = symbol.declarations ?? []

        if (
            declarations.some(declaration => {
                const sourceFileName = declaration.getSourceFile()?.fileName ?? "generated.d.ts"
                return sourceFileName.endsWith("buffer.d.ts")
            })
        ) {
            let typeArguments = ""

            if (node.typeName.text === "Buffer") {
                if (!node.typeArguments) {
                    typeArguments = "*"
                } else {
                    typeArguments = node.typeArguments
                        .map(typeArgument => render(typeArgument))
                        .filter(Boolean)
                        .join(", ")
                }
            }

            return `node.buffer.${render(node.typeName)}${karakum.ifPresent(typeArguments, it => `<${it}>`)}`
        }

        return null
    }


    return null
}
