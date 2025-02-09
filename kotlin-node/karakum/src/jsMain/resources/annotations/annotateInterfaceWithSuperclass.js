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

    // cluster
    "Cluster",

    // crypto
    "CipherCCM",
    "CipherGCM",
    "CipherOCB",
    "DecipherCCM",
    "DecipherGCM",
    "DecipherOCB",

    // events
    "EventEmitterReferencingAsyncResource",

    // fs
    "FSWatcher",
    "StatWatcher",

    // http2
    "Http2SecureServer",
    "Http2Server",
    "Http2Session",
    "Http2Stream",

    // process
    "Process",
    "ReadStream",
    "WriteStream",

    // stream
    "Stream",

    // test
    "TestError",

    // util
    "CustomPromisifySymbol",
    "DebugLogger",

    // zlib
    "BrotliCompress",
    "BrotliDecompress",
    "Deflate",
    "DeflateRaw",
    "Gunzip",
    "Gzip",
    "Inflate",
    "InflateRaw",
    "Unzip",
]

export default (node, context) => {
    if (
        ts.isInterfaceDeclaration(node)
        && interfacesWithSuperclass.some(name => node.name.text === name)
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isFunctionDeclaration(node.parent)
        && node.parent.name.text === "compileFunction"
        && node.parent.type === node
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isVariableDeclaration(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "writer"
        && node.parent.type === node
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    return null
}
