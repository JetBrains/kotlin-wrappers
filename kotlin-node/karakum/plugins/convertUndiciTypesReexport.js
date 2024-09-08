import ts from "typescript";

export default function (node) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("http.d.ts")) return null

    if (
        ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "WebSocket"
            || node.name.text === "CloseEvent"
            || node.name.text === "MessageEvent"
        )
    ) {
        return ""
    }
    return null
}
