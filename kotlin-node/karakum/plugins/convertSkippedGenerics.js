import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && (
            node.typeName.right.text === "TypedArray"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    return null
}
