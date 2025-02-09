import ts from "typescript"

export default (node) => {
    if (
        ts.isIdentifier(node)
        && node.text === "object"
        && ts.isParameter(node.parent)

        && ts.isMethodDeclaration(node.parent.parent)
        && ts.isClassDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "MockTracker"
    ) {
        return "target"
    }

    if (
        ts.isIdentifier(node)
        && (
            node.text === "object"
            || node.text === "val"
        )
        && (
            ts.isParameter(node.parent)
            || (
                ts.isTypePredicateNode(node.parent)
                && node.parent.parameterName === node
            )
        )
    ) {
        return "value"
    }

    return null
}
