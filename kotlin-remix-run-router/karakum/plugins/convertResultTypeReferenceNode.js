const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "ResultType"
    ) {
        return `ResultType /* ${node.getText()} */`
    }
    return null
}
