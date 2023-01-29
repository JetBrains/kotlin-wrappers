const ts = require("typescript")

module.exports = (node) => {
    if (
        ts.isArrayTypeNode(node.parent)
        && node.parent.elementType === node
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useMatches"
    ) {
        return "UseMatchesResultItem"
    }

    return null
}
