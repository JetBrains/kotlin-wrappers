import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTupleTypeNode(node)
        && node.elements.length === 5
    ) {
        const typeParameters = node.elements
            .map(typeParameter => render(typeParameter))
            .join(", ")

        return `js.core.JsTuple5<${typeParameters}>`
    }
    return null
}
