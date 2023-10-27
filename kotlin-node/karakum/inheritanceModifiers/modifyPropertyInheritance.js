import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("child_process.d.ts")
                && (
                    (
                        node.name.text === "stdin"
                        || node.name.text === "stdout"
                        || node.name.text === "stderr"
                        || node.name.text === "stdio"
                    )
                    && node.parent
                    && node.parent.name?.text === "ChildProcess"
                )
            )
        )
    ) {
        return "open"
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("child_process.d.ts")
                && (
                    node.name.text === "code"
                    && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                    && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                    && ts.isIdentifier(node.parent.parent.parent.name)
                    && node.parent.parent.parent.name.text === "ExecFileException"
                )
            )
        )
    ) {
        return "override"
    }

    return null
}
