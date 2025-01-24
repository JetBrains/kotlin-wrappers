import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTupleTypeNode(node)
        && node.elements.length === 2
    ) {
        return `js.array.JsTuple2<${render(node.elements[0])}, ${render(node.elements[1])}>`
    }
    return null
}
