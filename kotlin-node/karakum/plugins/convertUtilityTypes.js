import ts from "typescript"

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Pick"
            || node.typeName.text === "Omit"
        )
    ) {
        return render(node.typeArguments[0])
    }
    return null
}
