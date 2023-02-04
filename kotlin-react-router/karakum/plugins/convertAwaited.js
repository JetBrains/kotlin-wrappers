const ts = require("typescript")
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Awaited"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `Any? /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
