import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isClassDeclaration(node)
        && node.name
        && (
            (
                sourceFileName.endsWith("crypto.d.ts")
                && (
                    node.name.text === "Cipher"
                    || node.name.text === "Decipher"
                )
            )
            || (
                sourceFileName.endsWith("readline.d.ts")
                && (
                    node.name.text === "Interface"
                )
            )
            || (
                sourceFileName.endsWith("child_process.d.ts")
                && (
                    node.name.text === "ChildProcess"
                )
            )
            || (
                sourceFileName.endsWith("http.d.ts")
                && (
                    node.name.text === "IncomingMessage"
                    || node.name.text === "OutgoingMessage"
                    || node.name.text === "ServerResponse"
                    || node.name.text === "Agent"
                    || node.name.text === "Server"
                )
            )
            || (
                sourceFileName.endsWith("http2.d.ts")
                && (
                    node.name.text === "Http2ServerRequest"
                    || node.name.text === "Http2ServerResponse"
                )
            )
            || (
                sourceFileName.endsWith("net.d.ts")
                && (
                    node.name.text === "Server"
                    || node.name.text === "Socket"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    node.name.text === "ReadableBase"
                    || node.name.text === "WritableBase"
                    || node.name.text === "Readable"
                    || node.name.text === "Writable"
                    || node.name.text === "Duplex"
                    || node.name.text === "Transform"
                )
            )
            || (
                sourceFileName.endsWith("tty.d.ts")
                && (
                    node.name.text === "ReadStream"
                    || node.name.text === "WriteStream"
                )
            )
            || (
                sourceFileName.endsWith("async_hooks.d.ts")
                && (
                    node.name.text === "AsyncResource"
                )
            )
            || (
                sourceFileName.endsWith("perf_hooks.d.ts")
                && (
                    node.name.text === "PerformanceEntry"
                )
            )
            || (
                sourceFileName.endsWith("vm.d.ts")
                && (
                    node.name.text === "Module"
                )
            )
            || (
                sourceFileName.endsWith("tls.d.ts")
                && (
                    node.name.text === "Server"
                )
            )
            || (
                sourceFileName.endsWith("v8.d.ts")
                && (
                    node.name.text === "Serializer"
                    || node.name.text === "Deserializer"
                )
            )
        )
    ) {
        return "open"
    }

    return null
}
