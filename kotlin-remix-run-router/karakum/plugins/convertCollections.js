const ts = require("typescript");

module.exports = function (node, context, render) {
    if (ts.isArrayTypeNode(node)) {
        return `js.core.ReadonlyArray<${render(node.elementType)}>`
    }

    if (
        ts.isIdentifier(node)
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Record"
    ) {
        return "js.core.ReadonlyRecord"
    }

    if (
        ts.isIdentifier(node)
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Map"
    ) {
        return "js.collections.ReadonlyMap"
    }

    if (
        ts.isIdentifier(node)
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Set"
    ) {
        return "js.collections.ReadonlySet"
    }
    return null
}
