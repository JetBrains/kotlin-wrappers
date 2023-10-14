import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("readline.d.ts")
        && ts.isIdentifier(node)
        && node.text === "Interface"
        && node.parent
        && ts.isClassDeclaration(node.parent)
    ) {
        return `_Interface`
    }

    return null
}
