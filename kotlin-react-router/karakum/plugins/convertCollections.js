import ts from "typescript";

export default function (node, context, render) {
    if (ts.isArrayTypeNode(node)) {
        return `js.core.ReadonlyArray<${render(node.elementType)}>`
    }

    if (
        ts.isIdentifier(node)
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Record"
    ) {
        return "js.objects.ReadonlyRecord"
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
