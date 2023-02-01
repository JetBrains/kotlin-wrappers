const ts = require("typescript")

module.exports = (node) => {
    if (
        node.parent
        && ts.isArrayTypeNode(node.parent)
        && node.parent.elementType === node
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useMatches"
    ) {
        return "UseMatchesResultItem"
    }

    return null
}
