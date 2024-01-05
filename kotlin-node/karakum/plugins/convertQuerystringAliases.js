import ts from "typescript";

export default function (node) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("querystring.d.ts")
        && ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "encode"
            || node.name.text === "decode"
        )
    ) {
        // ignore querystring aliases
        return ""
    }
    return null
}
