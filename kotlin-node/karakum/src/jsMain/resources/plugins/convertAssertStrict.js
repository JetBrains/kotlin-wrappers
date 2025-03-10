import ts from "typescript"
import * as karakum from "../karakum.mjs"

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("assert.d.ts")
        && ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "strict"
    ) {
        return ""
    }

    return null
}
