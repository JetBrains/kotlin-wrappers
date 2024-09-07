import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("inspector.d.ts")
        && ts.isIdentifier(node)
        && node.text === "Session"
        && node.parent
        && ts.isClassDeclaration(node.parent)
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

        if (
            namespace
            && ts.isStringLiteral(namespace.name)
            && namespace.name.text === "inspector"
        ) {
            return `_Session`
        }
    }

    return null
}
