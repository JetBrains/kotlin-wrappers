import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "webcrypto"
    ) {
        if (node.right.text === "BufferSource") {
            return "js.buffer.BufferSource"
        }

        return `web.crypto.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "webcrypto"
    ) {
        return `web.crypto.${render(node.name)}`
    }

    return null
}
