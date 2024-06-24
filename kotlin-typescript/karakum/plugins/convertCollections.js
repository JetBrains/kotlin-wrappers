import ts from "typescript";

export default function (node, context, render) {
    if (ts.isArrayTypeNode(node)) {
        return `js.array.ReadonlyArray<${render(node.elementType)}>`
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
