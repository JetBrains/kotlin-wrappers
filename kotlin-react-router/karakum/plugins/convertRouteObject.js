const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "RouteObject"
    ) {
        return `external interface RouteObject /* ${node.getText()} */`
    }
    return null
}
