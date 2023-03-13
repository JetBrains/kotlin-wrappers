const ts = require("typescript")

module.exports = (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        || ts.isTypeAliasDeclaration(node)
        || ts.isTypeLiteralNode(node)
    ) {
        return "sealed"
    }

    return null
}
