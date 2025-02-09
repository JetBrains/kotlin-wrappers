import ts from "typescript";

export default function (node) {
    if (
        ts.isIdentifier(node)
        && node.text === "IterableIterator"

        && node.parent
        && ts.isTypeReferenceNode(node.parent)
        && node.parent.typeName === node
    ) {

        return "js.iterable.JsIterator"
    }
    if (
        ts.isIdentifier(node)
        && node.text === "AsyncIterableIterator"

        && node.parent
        && ts.isTypeReferenceNode(node.parent)
        && node.parent.typeName === node
    ) {

        return "js.iterable.AsyncIterator"
    }
    return null
}
