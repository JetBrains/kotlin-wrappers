import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        ts.isHeritageClause(node)

        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "TestContextAssert"

        && node.types.length === 1
        && ts.isExpressionWithTypeArguments(node.types[0])

        && node.types[0].typeArguments?.length === 2
        && ts.isImportTypeNode(node.types[0].typeArguments[0])
    ) {
        // remove import type node of assert module
        return ""
    }

    return null
}
