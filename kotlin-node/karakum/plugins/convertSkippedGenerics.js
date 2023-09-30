import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "ReadableStream"
        && !node.typeArguments
        && sourceFileName.endsWith("fs/promises.d.ts")
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && (
            node.typeName.right.text === "TypedArray"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    return null
}
