import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "NodeJS"
    ) {
        if (node.right.text === "ArrayBufferView") {
            return `js.buffer.ArrayBufferView`
        }
        if (node.right.text === "TypedArray") {
            return `js.typedarrays.TypedArray`
        }
        if (node.right.text === "Signals") {
            return `node.process.Signals`
        }
        if (node.right.text === "ProcessEnv") {
            return `node.process.ProcessEnv`
        }

        return `node.${render(node.right)}`
    }

    if (
        ts.isPropertyAccessExpression(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "NodeJS"
    ) {
        return `node.${render(node.name)}`
    }

    return null
}
