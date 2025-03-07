import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "streamWeb"
    ) {
        return `web.streams.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "streamWeb"
    ) {
        return `web.streams.${render(node.name)}`
    }

    return null
}
