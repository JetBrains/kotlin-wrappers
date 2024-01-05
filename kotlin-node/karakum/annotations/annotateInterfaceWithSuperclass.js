import ts from "typescript"

const interfacesWithSuperclass = [
    // globals
    "ErrnoException",
    "ReadableStream",
    "WritableStream",

    // child_process
    "ChildProcessByStdio",
    "ChildProcessWithoutNullStreams",
    "ExecException",
    "PromiseWithChild",

    // crypto
    "CipherCCM",
    "CipherGCM",
    "CipherOCB",
    "DecipherCCM",
    "DecipherGCM",
    "DecipherOCB",

    // fs
    "FSWatcher",
    "StatWatcher",

    // process
    "Process",
    "ReadStream",
    "WriteStream",

    // stream
    "Stream"
]

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && interfacesWithSuperclass.some(name => node.name.text === name)
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    return null
}
