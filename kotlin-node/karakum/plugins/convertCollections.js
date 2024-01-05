import ts from "typescript";

export default function (node, context, render) {
    if (ts.isArrayTypeNode(node)) {
        return `js.array.ReadonlyArray<${render(node.elementType)}>`
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
        && node.text === "Iterable"
    ) {
        return "js.iterable.JsIterable"
    }
    return null
}
