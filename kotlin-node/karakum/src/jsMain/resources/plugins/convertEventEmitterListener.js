import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Function"

        && node.typeArguments
        && node.typeArguments[0]
        && node.typeArguments[0].kind === ts.SyntaxKind.AnyKeyword

        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "listener"

        && sourceFileName.endsWith("events.d.ts")
    ) {
        return `${render(node.typeName)}<Unit>`
    }

    return null
}
