import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "MouseEvent"
        && !node.typeArguments
    ) {
        if (
            ts.isTypeReferenceNode(node.parent)
            && ts.isQualifiedName(node.parent.typeName)
            && ts.isIdentifier(node.parent.typeName.left)
            && node.parent.typeName.left.text === "React"
            && node.parent.typeName.right.text === "MouseEvent"
        ) {
            return "*"
        }

        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Fetcher"
            || node.typeName.text === "BeforeUnloadEvent"
        )
        && !node.typeArguments
    ) {
        if (ts.isIntersectionTypeNode(node.parent)) {
            return `${render(node.typeName)}<Any?>`
        }

        return `${render(node.typeName)}<*>`
    }
    return null
}
