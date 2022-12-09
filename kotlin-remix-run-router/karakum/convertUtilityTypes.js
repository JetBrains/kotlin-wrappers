const ts = require("typescript")

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Partial"
            || node.typeName.text === "Readonly"
            || node.typeName.text === "Exclude"
        )
    ) {
        return render(node.typeArguments[0])
    }
    return null
}
