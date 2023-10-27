import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isInterfaceDeclaration(node)
        && (
            (
                sourceFileName.endsWith("fs.d.ts")
                && (
                    node.name.text === "ObjectEncodingOptions"
                )
            )
        )
    ) {
        return ""
    }

    if (
        ts.isInterfaceDeclaration(node)
        || ts.isTypeAliasDeclaration(node)
        || ts.isTypeLiteralNode(node)
        || ts.isIntersectionTypeNode(node)
    ) {
        return "sealed"
    }

    return null
}
