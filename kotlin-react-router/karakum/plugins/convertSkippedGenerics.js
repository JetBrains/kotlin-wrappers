const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.right)
        && (
            node.typeName.right.text === "ReactElement"
            || node.typeName.right.text === "ComponentType"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    return null
}
