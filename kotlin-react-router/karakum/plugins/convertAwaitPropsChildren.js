const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isUnionTypeNode(node)

        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && ts.isIdentifier(node.types[1].typeName)
        && node.types[1].typeName.text === "AwaitResolveRenderFunction"
    ) {
        // more general type
        return "AwaitResolveRenderFunction"
    }

    return null
}
