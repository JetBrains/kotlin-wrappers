const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "ResultType"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `ResultType /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
