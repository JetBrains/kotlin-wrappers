const ts = require("typescript")

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Partial"
        )
    ) {
        return render(node.typeArguments[0])
    }
    return null
}
