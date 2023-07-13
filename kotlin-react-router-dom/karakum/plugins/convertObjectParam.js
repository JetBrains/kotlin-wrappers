import ts from "typescript"

export default (node) => {
    if (
        ts.isIdentifier(node)
        && node.text === "object"
        && ts.isParameter(node.parent)
    ) {
        return "value"
    }

    return null
}
