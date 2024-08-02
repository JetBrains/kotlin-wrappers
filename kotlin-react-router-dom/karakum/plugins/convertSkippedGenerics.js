import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Fetcher"
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
