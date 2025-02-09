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
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Channel"
        && !node.typeArguments
        && sourceFileName.endsWith("diagnostics_channel.d.ts")
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "TracingChannelCollection"
        && !node.typeArguments
        && sourceFileName.endsWith("diagnostics_channel.d.ts")
    ) {
        return `${render(node.expression)}<StoreType, ContextType>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && (
            node.typeName.right.text === "TypedArray"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *, *, *>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && (
            node.typeName.right.text === "ArrayBufferView"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "DataView"
            || node.typeName.text === "Float32Array"
            || node.typeName.text === "Float64Array"
            || node.typeName.text === "Int8Array"
            || node.typeName.text === "Int16Array"
            || node.typeName.text === "Int32Array"
            || node.typeName.text === "Uint8Array"
            || node.typeName.text === "Uint8ClampedArray"
            || node.typeName.text === "Uint16Array"
            || node.typeName.text === "Uint32Array"
            || node.typeName.text === "BigInt64Array"
            || node.typeName.text === "BigUint64Array"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "Uint8Array"
        && !node.typeArguments
    ) {
        return `${render(node.expression)}<ArrayBufferLike>`
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
            return "js.function.JsFunction<Nothing, Any?>"
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
            node.typeName.text === "GeneratorFunction"
            || node.typeName.text === "AsyncGeneratorFunction"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Generator"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *, *>`
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
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Http2ServerResponse"
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Http2Server"
            || node.typeName.text === "Http2SecureServer"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *, *, *>`
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
        return "js.function.JsFunction<Nothing, Any?>"
    }

    return null
}
