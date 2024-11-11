import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Function"
        && !node.typeArguments
    ) {
        if (
            ts.isParameter(node.parent)
            && ts.isIdentifier(node.parent.name)
            && node.parent.name.text === "listener"
        ) {
            return `${render(node.typeName)}<Unit>`
        }

        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Event"
        && !node.typeArguments
    ) {
        if (ts.isTypeAliasDeclaration(node.parent)) {
            return `${render(node.typeName)}`
        }

        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Uint8Array"
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "Event"
        && !node.typeArguments
    ) {
        return `${render(node.expression)}<Any>`
    }

    return null
}
