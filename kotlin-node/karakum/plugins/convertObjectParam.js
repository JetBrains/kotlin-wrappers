import ts from "typescript"

export default (node) => {
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
