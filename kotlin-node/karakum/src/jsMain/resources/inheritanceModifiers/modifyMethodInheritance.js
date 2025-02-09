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

function isGenericEventEmitterSignature(context, options = {}) {
    const { symbolSignature = true } = options

    return (
        context.signature?.[0]?.parameter.type
        && (
            context.signature[0].parameter.type.kind === ts.SyntaxKind.StringKeyword
            || (
                ts.isUnionTypeNode(context.signature[0].parameter.type)
                && context.signature[0].parameter.type.types[0]
                && context.signature[0].parameter.type.types[0].kind === ts.SyntaxKind.StringKeyword

                && (
                    symbolSignature
                    || context.signature[0].type.kind !== ts.SyntaxKind.SymbolKeyword
                )
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
                    && node.parent.name?.text === "Server"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    node.name.text === "setTimeout"
                    && node.parent
                    && node.parent.name?.text === "OutgoingMessage"
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    (
                        node.name.text === "closeAllConnections"
                        || node.name.text === "closeIdleConnections"
                    )
                    && node.parent
                    && node.parent.name?.text === "Server"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "compose"
                    )
                    && node.parent
                    && node.parent.name?.text === "internal"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "_destroy"
                        || node.name.text === "_construct"
                        || node.name.text === "destroy"
                        || node.name.text === "read"
                    )
                    && node.parent
                    && node.parent.name?.text === "ReadableBase"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "_write"
                        || node.name.text === "_writev"
                        || node.name.text === "_destroy"
                        || node.name.text === "_final"
                        || node.name.text === "write"
                        || node.name.text === "setDefaultEncoding"
                        || (
                            node.name.text === "end"
                            && node.parameters.length > 1
                        )
                        || node.name.text === "cork"
                        || node.name.text === "uncork"
                        || node.name.text === "_construct"
                        || node.name.text === "destroy"
                    )
                    && node.parent
                    && node.parent.name?.text === "WritableBase"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name?.text === "ReadableBase"
                        || node.parent.name?.text === "WritableBase"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("readline.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name?.text === "Interface"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("perf_hooks.d.ts")
                && (
                    (
                        node.name.text === "toJSON"
                    )
                    && node.parent
                    && node.parent.name?.text === "PerformanceEntry"
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
            || (
                sourceFileName.endsWith("fs.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name?.text === "ReadStream"
                        || node.parent.name?.text === "WriteStream"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("https.d.ts")
                && (
                    (
                        node.name.text === "closeAllConnections"
                        || node.name.text === "closeIdleConnections"
                    )
                    && node.parent
                    && node.parent.name?.text === "Server"
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "Server"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    node.name.text === "setTimeout"
                    && node.parent
                    && node.parent.name?.text === "ClientRequest"
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "ClientRequest"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    node.name.text === "destroy"
                    && node.parent
                    && node.parent.name?.text === "IncomingMessage"
                )
            )
            || (
                sourceFileName.endsWith("net.d.ts")
                && (
                    (
                        (
                            node.name.text === "write"
                            && !(
                                context.signature?.length === 3
                                && context.signature?.[0]?.parameter.type
                                && ts.isTypeReferenceNode(context.signature[0].type)
                                && ts.isIdentifier(context.signature[0].type.typeName)
                                && context.signature[0].type.typeName.text === "Uint8Array"
                            )
                        )
                        || (
                            node.name.text === "end"
                            && !(
                                context.signature?.length === 3
                                && context.signature?.[0]?.parameter.type
                                && ts.isTypeReferenceNode(context.signature[0].type)
                                && ts.isIdentifier(context.signature[0].type.typeName)
                                && context.signature[0].type.typeName.text === "Uint8Array"
                            )
                        )
                        || node.name.text === "setEncoding"
                        || node.name.text === "pause"
                        || node.name.text === "resume"
                    )
                    && node.parent
                    && node.parent.name?.text === "Socket"
                )
            )
            || (
                sourceFileName.endsWith("net.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "Socket"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "setEncoding"
                        || node.name.text === "pause"
                        || node.name.text === "resume"
                        || node.name.text === "isPaused"
                        || node.name.text === "unpipe"
                        || node.name.text === "wrap"
                    )
                    && node.parent
                    && node.parent.name?.text === "ReadableBase"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    node.name.text === "end"
                    && context.signature?.length === 1
                    && context.signature?.[0]?.parameter.type
                    && ts.isFunctionTypeNode(context.signature[0].parameter.type)
                    && node.parent
                    && node.parent.name?.text === "WritableBase"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "_write"
                        || node.name.text === "_writev"
                        || node.name.text === "_destroy"
                        || node.name.text === "_final"
                        || node.name.text === "write"
                        || node.name.text === "setDefaultEncoding"
                        || node.name.text === "end"
                        || node.name.text === "cork"
                        || node.name.text === "uncork"
                    )
                    && node.parent
                    && node.parent.name?.text === "Duplex"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "Duplex"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("tty.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "WriteStream"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("util.d.ts")
                && (
                    (
                        node.name.text === "toString"
                    )
                    && node.parent
                    && node.parent.name?.text === "MIMEType"
                )
            )
            || (
                sourceFileName.endsWith("test.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name?.text === "TestsStream"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("crypto.d.ts")
                && (
                    (
                        node.name.text === "toString"
                    )
                    && node.parent
                    && node.parent.name?.text === "X509Certificate"
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    (
                        node.name.text === "end"
                        && !(
                            context.signature?.length === 3
                            && context.signature?.[0]?.parameter.type
                            && ts.isTypeReferenceNode(context.signature[0].type)
                            && ts.isIdentifier(context.signature[0].type.typeName)
                            && context.signature[0].type.typeName.text === "Uint8Array"
                        )
                    )
                    && node.parent
                    && node.parent.name.text === "Http2ServerResponse"
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    (
                        node.name.text === "read"
                    )
                    && node.parent
                    && node.parent.name.text === "Http2ServerRequest"
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name.text === "Http2ServerRequest"
                        || node.parent.name.text === "Http2ServerResponse"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("https.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name.text === "Server"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("repl.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && node.parent.name.text === "REPLServer"
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("perf_hooks.d.ts")
                && (
                    (
                        node.name.text === "toJSON"
                    )
                    && node.parent
                    && node.parent.name?.text === "PerformanceResourceTiming"
                )
            )
        )
    ) {
        return "override"
    }

    if (
        ts.isMethodSignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "construct"
                        || node.name.text === "read"
                        || node.name.text === "write"
                        || node.name.text === "writev"
                        || node.name.text === "final"
                        || node.name.text === "destroy"
                    )
                    && node.parent
                    && (
                        node.parent.name.text === "DuplexOptions"
                        || node.parent.name.text === "TransformOptions"
                    )
                )
            )
            || (
                sourceFileName.endsWith("globals.d.ts")
                && (
                    (
                        node.name.text === "toString"
                    )
                    && node.parent
                    && node.parent.name.text === "CallSite"
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name.text === "ClientHttp2Session"
                        || node.parent.name.text === "ClientHttp2Stream"
                        || node.parent.name.text === "Http2Stream"
                        || node.parent.name.text === "ServerHttp2Session"
                    )
                    && isGenericEventEmitterSignature(context)
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name.text === "Http2SecureServer"
                        || node.parent.name.text === "Http2Server"
                    )
                    && isGenericEventEmitterSignature(context, {
                        symbolSignature: node.name.text === "emit"
                    })
                )
            )
        )
    ) {
        return "override"
    }

    return null
}
