import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("child_process.d.ts")
                && (
                    (
                        node.name.text === "stdin"
                        || node.name.text === "stdout"
                        || node.name.text === "stderr"
                        || node.name.text === "stdio"
                    )
                    && node.parent
                    && node.parent.name?.text === "ChildProcess"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "closed"
                        || node.name.text === "errored"
                        || node.name.text === "destroyed"
                    )
                    && node.parent
                    && node.parent.name?.text === "ReadableBase"
                )
            )
            || (
                sourceFileName.endsWith("stream.d.ts")
                && (
                    (
                        node.name.text === "writableEnded"
                        || node.name.text === "writableFinished"
                        || node.name.text === "writableHighWaterMark"
                        || node.name.text === "writableLength"
                        || node.name.text === "writableObjectMode"
                        || node.name.text === "writableCorked"
                        || node.name.text === "writableNeedDrain"
                        || node.name.text === "closed"
                        || node.name.text === "errored"
                        || node.name.text === "destroyed"
                    )
                    && node.parent
                    && node.parent.name?.text === "WritableBase"
                )
            )
            || (
                sourceFileName.endsWith("perf_hooks.d.ts")
                && (
                    (
                        node.name.text === "duration"
                        || node.name.text === "entryType"
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
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("diagnostics_channel.d.ts")
                && (
                    (
                        node.name.text === "start"
                        || node.name.text === "end"
                        || node.name.text === "asyncStart"
                        || node.name.text === "asyncEnd"
                        || node.name.text === "error"
                    )
                    && node.parent
                    && node.parent.name?.text === "TracingChannel"
                )
            )
        )
    ) {
        return "override"
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                sourceFileName.endsWith("child_process.d.ts")
                && (
                    node.name.text === "code"
                    && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                    && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                    && ts.isIdentifier(node.parent.parent.parent.name)
                    && node.parent.parent.parent.name.text === "ExecFileException"
                )
            )
            || (
                sourceFileName.endsWith("https.d.ts")
                && (
                    (
                        node.name.text === "rejectUnauthorized"
                    )
                    && node.parent
                    && ts.isInterfaceDeclaration(node.parent)
                    && node.parent.name.text === "AgentOptions"
                )
            )
            || (
                sourceFileName.endsWith("test.d.ts")
                && (
                    (
                        node.name.text === "cause"
                    )
                    && node.parent
                    && ts.isInterfaceDeclaration(node.parent)
                    && node.parent.name.text === "TestError"
                )
            )
            || (
                sourceFileName.endsWith("readline/promises.d.ts")
                && (
                    (
                        node.name.text === "completer"
                    )
                    && node.parent
                    && ts.isInterfaceDeclaration(node.parent)
                    && node.parent.name.text === "ReadLineOptions"
                )
            )
        )
    ) {
        return "override"
    }

    return null
}
