import ts from "typescript"

function isEventEmitterMethodName(name) {
    return (
        name === "on"
        || name === "once"
        || name === "emit"
        || name === "addListener"
        || name === "removeListener"
        || name === "prependListener"
        || name === "prependOnceListener"
    )
}

function isGenericEventEmitterSignature(context) {
    return (
        context.signature?.[0]?.parameter.type
        && (
            context.signature[0].parameter.type.kind === ts.SyntaxKind.StringKeyword
            || (
                ts.isUnionTypeNode(context.signature[0].parameter.type)
                && context.signature[0].parameter.type.types[0]
                && context.signature[0].parameter.type.types[0].kind === ts.SyntaxKind.StringKeyword
            )
        )
    )
}

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isMethodDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("net.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name?.text === "Server"
                        || node.parent.name?.text === "Socket"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
        )
    ) {
        return "open"
    }

    if (
        ts.isMethodDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("http.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "Server"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("tls.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "Server"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("tls.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "TLSSocket"
                    && isGenericEventEmitterSignature(context)
                )
            )
        )
    ) {
        return "override"
    }

    return null
}
