const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "JsonFunction"
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    return null
}
