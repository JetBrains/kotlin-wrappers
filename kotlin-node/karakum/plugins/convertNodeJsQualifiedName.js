import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "NodeJS"
    ) {
        if (node.right.text === "Iterator") {
            return `js.iterable.JsIterator`
        }
        if (node.right.text === "AsyncIterator") {
            return `js.iterable.AsyncIterator`
        }
        if (node.right.text === "ArrayBufferView") {
            return `js.buffer.ArrayBufferView`
        }
        if (node.right.text === "TypedArray") {
            return `js.typedarrays.TypedArray`
        }
        if (node.right.text === "EventEmitter") {
            return `node.events.EventEmitter`
        }
        if (node.right.text === "Module") {
            return `node.module.Module`
        }
        if (node.right.text === "Require") {
            return `node.module.Require`
        }
        if (node.right.text === "Signals") {
            return `node.process.Signals`
        }
        if (node.right.text === "ProcessEnv") {
            return `node.process.ProcessEnv`
        }
        if (node.right.text === "Platform") {
            return `node.process.Platform`
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
