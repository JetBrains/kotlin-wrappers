package node.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private val jsoInterfaces = setOf(
    // child_process
    "CommonExecOptions",
    "CommonOptions",
    "CommonSpawnOptions",
    "ExecFileOptions",
    "ExecFileOptionsWithBufferEncoding",
    "ExecFileOptionsWithOtherEncoding",
    "ExecFileOptionsWithStringEncoding",
    "ExecFileSyncOptions",
    "ExecFileSyncOptionsWithBufferEncoding",
    "ExecFileSyncOptionsWithStringEncoding",
    "ExecOptions",
    "ExecOptionsWithBufferEncoding",
    "ExecOptionsWithStringEncoding",
    "ExecSyncOptions",
    "ExecSyncOptionsWithBufferEncoding",
    "ExecSyncOptionsWithStringEncoding",
    "ForkOptions",
    "MessagingOptions",
    "ProcessEnvOptions",
    "SpawnOptions",
    "SpawnOptionsWithStdioTuple",
    "SpawnOptionsWithoutStdio",
    "SpawnSyncOptions",
    "SpawnSyncOptionsWithBufferEncoding",
    "SpawnSyncOptionsWithStringEncoding",

    // crypto
    "CipherGCMOptions",
    "CipherCCMOptions",
    "CipherOCBOptions",
    "HashOptions",
    "CipherChaCha20Poly1305Options",

    // dgram
    "SocketOptions",

    // events
    "StaticEventEmitterIteratorOptions",
    "StaticEventEmitterOptions",

    // fs
    "ObjectEncodingOptions",
    "FlagAndOpenMode",
    "MakeDirectoryOptions",
    "MkdirOptions",
    "MkdirAsyncOptions",
    "MkdirRecursiveOptions",
    "MkdirRecursiveAsyncOptions",
    "MkdirSyncOptions",
    "MkdirSyncRecursiveOptions",
    "ReadStreamOptions",
    "CreateReadStreamOptions",
    "WriteStreamOptions",
    "WatchOptions",
    "WatchOptionsWithBufferEncoding",
    "WatchOptionsWithStringEncoding",
    "WatchFileOptions",

    // net
    "ListenOptions",

    // stream
    "FinishedOptions",
    "StreamOptions",
    "ReadableOptions",
    "WritableOptions",
    "DuplexOptions",
    "TransformOptions",
)

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text in jsoInterfaces)

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "options")

        val function = ensureNotNull(parameter.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(
            functionName.text == "exec"

                    || functionName.text == "readdir"
                    || functionName.text == "readdirSync"
                    || functionName.text == "mkdir"
                    || functionName.text == "mkdirSync"
        )

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val parenthesizedType = ensureNotNull(node.getParentOrNull())
        ensure(isParenthesizedTypeNode(parenthesizedType))

        val union = ensureNotNull(parenthesizedType.getParentOrNull())
        ensure(isUnionTypeNode(union))

        val parameter = ensureNotNull(union.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "options")

        nullable {
            val function = ensureNotNull(parameter.getParentOrNull())
            ensure(isFunctionDeclaration(function))

            val functionName = ensureNotNull(function.name)
            ensure(
                functionName.text == "exec"
                        || functionName.text == "execFile"

                        || functionName.text == "appendFile"
                        || functionName.text == "readdir"
                        || functionName.text == "readdirSync"
                        || functionName.text == "readFile"
                        || functionName.text == "readFileSync"
                        || functionName.text == "mkdir"
                        || functionName.text == "mkdirSync"
                        || functionName.text == "writeFile"
                        || functionName.text == "watch"
                        || functionName.text == "watchFile"
            )

            "@kotlinx.js.JsPlainObject"
        } ?: nullable {
            val method = ensureNotNull(parameter.getParentOrNull())
            ensure(isMethodSignature(method))

            val methodName = method.name
            ensure(isIdentifier(methodName))
            ensure(
                methodName.text == "appendFile"
                        || methodName.text == "readFile"
                        || methodName.text == "writeFile"
            )

            "@kotlinx.js.JsPlainObject"
        }
    }
}
