import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("stream.d.ts")) return null

    if (
        ts.isIdentifier(node)
        && (
            node.text === "Readable"
            || node.text === "Writable"
        )

        && node?.parent?.parent // Identifier / TypeReference / ExpressionWithTypeArguments
        && ts.isExpressionWithTypeArguments(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.expression)
        && node.parent.parent.expression.text === "StreamOptions"

        && node?.parent?.parent?.parent?.parent // Identifier / TypeReference / ExpressionWithTypeArguments / HeritageClause / InterfaceDeclaration
        && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
        && (
            node.parent.parent.parent.parent.name.text === "ReadableOptions"
            || node.parent.parent.parent.parent.name.text === "WritableOptions"
        )
    ) {
        return `Stream /* ${render(node)} */`
    }

    return null
}
