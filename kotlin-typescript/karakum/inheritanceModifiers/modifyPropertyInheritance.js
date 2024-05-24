import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "kind"
            || node.name.text === "parent"
        )

        && (
            !node.parent
            || !ts.isInterfaceDeclaration(node.parent)
            || node.parent.name.text !== "Node"
        )
        && (
            !node.parent
            || !ts.isInterfaceDeclaration(node.parent)
            || node.parent.name.text !== "TypePredicateBase"
        )
    ) {
        return "override"
    }

    return null
}
