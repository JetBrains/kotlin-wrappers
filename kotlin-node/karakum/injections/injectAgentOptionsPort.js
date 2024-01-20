import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("https.d.ts")) return null

    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "AgentOptions"
    ) {
        return "override var port: dynamic"
    }

    return null
}
