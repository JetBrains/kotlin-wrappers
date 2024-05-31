import ts from "typescript"

export default (node) => {
    if (
        ts.isMethodSignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                node.name.text === "getCurrentDirectory"
                && node.parent
                && node.parent.name?.text === "CompilerHost"
            )
        )
    ) {
        return "override"
    }

    return null
}
