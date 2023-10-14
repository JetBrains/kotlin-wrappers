import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("readline.d.ts")
        && ts.isClassDeclaration(node)
        && node.name.text === "Interface"
    ) {
        return `@JsName("Interface")`
    }

    return null
}
