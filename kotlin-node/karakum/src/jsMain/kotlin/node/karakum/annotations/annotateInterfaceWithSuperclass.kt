package node.karakum.annotations

import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import arrow.core.raise.nullable
import typescript.Node
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isVariableDeclaration

private val interfacesWithSuperclass = setOf(
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
    "CipherChaCha20Poly1305",
    "DecipherCCM",
    "DecipherGCM",
    "DecipherOCB",
    "DecipherChaCha20Poly1305",

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
    "Error",
    "TestError",
    "TestsStream",

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
    "ZstdCompress",
    "ZstdDecompress",
)

fun annotateInterfaceWithSuperclass(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text in interfacesWithSuperclass)

        "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
    } ?: nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val function = ensureNotNull(node.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "compileFunction")

        "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
    } ?: nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val variable = ensureNotNull(node.getParentOrNull())
        ensure(isVariableDeclaration(variable))

        val variableName = ensureNotNull(variable.name)
        ensure(isIdentifier(variableName))
        ensure(variableName.text == "writer")

        "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
    }
}
