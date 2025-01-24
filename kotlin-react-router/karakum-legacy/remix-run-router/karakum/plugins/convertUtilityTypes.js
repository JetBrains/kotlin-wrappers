import ts from "typescript"

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Partial"
            || node.typeName.text === "Readonly"
            || node.typeName.text === "Exclude"
            || node.typeName.text === "Pick"
            || node.typeName.text === "Omit"
            // custom
            || node.typeName.text === "RequireOne"
        )
    ) {
        return render(node.typeArguments[0])
    }
    return null
}
