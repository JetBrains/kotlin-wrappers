import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "React"
    ) {
        return `react.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "React"
    ) {
        return `react.${render(node.name)}`
    }

    return null
}
