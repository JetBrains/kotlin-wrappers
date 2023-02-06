const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isIdentifier(node)
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Record"
    ) {
        return "js.core.ReadonlyRecord"
    }
    return null
}
