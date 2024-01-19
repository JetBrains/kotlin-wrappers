import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "ReadableStream"
        && !node.typeArguments
        && sourceFileName.endsWith("fs/promises.d.ts")
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "streamWeb"
        && (
            node.typeName.right.text === "ReadableStream"
            || node.typeName.right.text === "WritableStream"
        )
        && !node.typeArguments
        && sourceFileName.endsWith("stream.d.ts")
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && (
            node.typeName.right.text === "TypedArray"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Function"
        )
        && !node.typeArguments
    ) {
        if (ts.isIntersectionTypeNode(node.parent)) {
            return "js.function.JsFunction<js.array.JsTuple, Any?>"
        }

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
        && (
            node.typeName.text === "AsyncGeneratorFunction"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *, *, *>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "AsyncGenerator"
        )
        && node.typeArguments
        && node.typeArguments.length === 2
    ) {
        const typeArguments = node.typeArguments
            ?.map(typeArgument => render(typeArgument))
            ?.join(", ")

        return `${render(node.typeName)}<${typeArguments}, *>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "MockFunctionCall"
        )
        && node.typeArguments
        && node.typeArguments.length === 1
    ) {
        const typeArguments = node.typeArguments
            ?.map(typeArgument => render(typeArgument))
            ?.join(", ")

        return `${render(node.typeName)}<${typeArguments}, *, *>`
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "OutgoingMessage"
        && !node.typeArguments
    ) {
        return `${render(node.expression)}<IncomingMessage>`
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "Function"
        && !node.typeArguments
    ) {
        return "js.function.JsFunction<js.array.JsTuple, Any?>"
    }

    return null
}
