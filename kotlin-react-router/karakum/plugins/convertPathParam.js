const ts = require("typescript");

module.exports = function (node) {
    const isUseMatch = node.parent?.parent?.parent !== undefined
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "useMatch"

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Path"
        && isUseMatch
    ) {
        return "String"
    }
    return null
}
