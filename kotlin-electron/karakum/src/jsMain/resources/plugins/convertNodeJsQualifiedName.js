import ts from "typescript";

function convertNodePackageQualifiedName(node, context, render) {
    if (
        ts.isIdentifier(node)
        && node.text === "EventEmitter"
    ) {
        return `node.events.EventEmitter`
    }

    return null
}

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "NodeJS"
    ) {
        const result = convertNodePackageQualifiedName(node.right, context, render)
        if (result !== null) return result

        return `node.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "NodeJS"
    ) {
        const result = convertNodePackageQualifiedName(node.name, context, render)
        if (result !== null) return result

        return `node.${render(node.name)}`
    }

    return null
}
