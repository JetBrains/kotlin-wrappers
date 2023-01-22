const ts = require("typescript");

module.exports = function (node) {
    if (
        node.kind === ts.SyntaxKind.UnknownKeyword
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Record"
    ) {

        return "Any"
    }
    return null
}
