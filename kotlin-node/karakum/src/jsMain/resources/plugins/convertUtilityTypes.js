import ts from "typescript"

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Partial"
            || node.typeName.text === "Pick"
            || node.typeName.text === "Omit"
        )
    ) {
        return render(node.typeArguments[0])
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && (
            node.expression.text === "Partial"
            || node.expression.text === "Omit"
        )
    ) {
        return render(node.typeArguments[0])
    }
    return null
}
