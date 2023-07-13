import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Function"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }
    return null
}
