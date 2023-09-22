import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("buffer.d.ts")
        && ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "SlowBuffer"
    ) {
        return ""
    }


    return null
}
