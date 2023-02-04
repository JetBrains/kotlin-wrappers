const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "RouteProps"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `external interface RouteProps : react.Props /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
