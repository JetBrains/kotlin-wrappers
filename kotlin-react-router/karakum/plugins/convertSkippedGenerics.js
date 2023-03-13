const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "RouteMatch"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.right)
        && (
            node.typeName.right.text === "ReactElement"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.right)
        && (
            node.typeName.right.text === "ComponentType"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    return null
}
