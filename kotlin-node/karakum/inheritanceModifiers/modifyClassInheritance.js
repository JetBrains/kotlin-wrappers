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
                )
            )
        )
    ) {
        return "open"
    }

    return null
}
