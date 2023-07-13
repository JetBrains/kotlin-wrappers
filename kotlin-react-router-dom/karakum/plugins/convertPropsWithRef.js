import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isIntersectionTypeNode(node)
        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && (
            (
                ts.isQualifiedName(node.types[1].typeName)
                && ts.isIdentifier(node.types[1].typeName.left)
                && node.types[1].typeName.left.text === "React"
                && node.types[1].typeName.right.text === "RefAttributes"
            )
            || (
                ts.isIdentifier(node.types[1].typeName)
                && node.types[1].typeName.text === "RefAttributes"
            )
        )
    ) {
        return render(node.types[0])
    }
    return null
}
