import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isMethodDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("semver.d.ts")
                && (
                    (
                        node.name.text === "toString"
                    )
                    && node.parent
                    && node.parent.name?.text === "SemVer"
                )
            )
        )
    ) {
        return "override"
    }

    return null
}
