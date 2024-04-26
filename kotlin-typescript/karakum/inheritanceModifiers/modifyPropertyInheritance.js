import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "kind"
            || node.name.text === "parent"
        )
    ) {
        return "override"
    }

    return null
}
