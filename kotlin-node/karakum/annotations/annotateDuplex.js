import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("stream.d.ts")
        && ts.isClassDeclaration(node)
        && node.name?.text === "Duplex"
    ) {
        return `@Suppress("MANY_CLASSES_IN_SUPERTYPE_LIST")`
    }

    return null
}
