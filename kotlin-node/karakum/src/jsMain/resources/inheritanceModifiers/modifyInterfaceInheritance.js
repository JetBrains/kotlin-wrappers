import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isInterfaceDeclaration(node)
        && (
            (
                sourceFileName.endsWith("fs.d.ts")
                && (
                    node.name.text === "ObjectEncodingOptions"
                )
            )
            || (
                sourceFileName.endsWith("events.d.ts")
                && (
                    node.name.text === "Abortable"
                )
            )
            || (
                sourceFileName.endsWith("net.d.ts")
                && (
                    node.name.text === "ServerOpts"
                    || node.name.text === "TcpSocketConnectOpts"
                )
            )
            || (
                sourceFileName.endsWith("globals.d.ts")
                && (
                    node.name.text === "ErrnoException"
                    || node.name.text === "ReadableStream"
                    || node.name.text === "ReadWriteStream"
                    || node.name.text === "WritableStream"
                    || node.name.text === "RefCounted"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    node.name.text === "TransformOptions"
                )
            )
            || (
                sourceFileName.endsWith("async_hooks.d.ts")
                && (
                    node.name.text === "AsyncResourceOptions"
                )
            )
            || (
                sourceFileName.endsWith("tls.d.ts")
                && (
                    node.name.text === "ConnectionOptions"
                    || node.name.text === "SecureContextOptions"
                    || node.name.text === "TlsOptions"
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    node.name.text === "IncomingHttpHeaders"
                    || node.name.text === "AgentOptions"
                    || node.name.text === "RequestOptions"
                    || node.name.text === "ServerOptions"
                )
            )
            || (
                sourceFileName.endsWith("globals.d.ts")
                && (
                    node.name.text === "Module"
                )
            )
        )
    ) {
        return ""
    }

    if (
        ts.isInterfaceDeclaration(node)
        || ts.isTypeAliasDeclaration(node)
        || ts.isTypeLiteralNode(node)
        || ts.isIntersectionTypeNode(node)
    ) {
        return "sealed"
    }

    return null
}
