import ts from "typescript"

export default (node) => {
    if (
        node.name.text === "TKind"
        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "Token"
    ) {
        return "out"
    }

    return null
}
