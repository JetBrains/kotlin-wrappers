import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "Electron"
    ) {
        return `electron.core.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "Electron"
    ) {
        return `electron.core.${render(node.name)}`
    }

    return null
}
