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
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "_destroy"
                        || node.name.text === "_construct"
                        || node.name.text === "destroy"
                    )
                    && node.parent
                    && node.parent.name?.text === "Readable"
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
                    && node.parent.name?.text === "Writable"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    isEventEmitterMethodName(node.name.text)
                    && node.parent
                    && (
                        node.parent.name?.text === "Readable"
                        || node.parent.name?.text === "Writable"
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
                    && node.parent.name?.text === "Readable"
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
                    && node.parent.name?.text === "Writable"
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
        )
    ) {
        return "override"
    }

    return null
}
