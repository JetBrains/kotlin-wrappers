import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("readline/promises.d.ts")
                && (
                    (
                        node.name.text === "completer"
                    )
                    && node.parent
                    && ts.isInterfaceDeclaration(node.parent)
                    && node.parent.name.text === "ReadLineOptions"
                )
            )
        )
    ) {
        return `@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")`
    }

    return null
}
