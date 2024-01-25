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

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && interfacesWithSuperclass.some(name => node.name.text === name)
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    return null
}
