const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "Navigation"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `external interface Navigation /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
