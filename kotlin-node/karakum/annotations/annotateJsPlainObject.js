import ts from "typescript"

const jsoInterfacesWithGenerics = [
    "SpawnOptionsWithStdioTuple"
]

const jsoInterfaces = [
    // child_process
    "CommonOptions",
    "CommonExecOptions",
    "CommonSpawnOptions",
    "ExecOptions",
    "ExecOptionsWithBufferEncoding",
    "ExecOptionsWithStringEncoding",
    "ExecSyncOptions",
    "ExecSyncOptionsWithBufferEncoding",
    "ExecSyncOptionsWithStringEncoding",
    "ExecFileSyncOptions",
    "ExecFileSyncOptionsWithBufferEncoding",
    "ExecFileSyncOptionsWithStringEncoding",
    "ProcessEnvOptions",
    "SpawnOptions",
    "SpawnOptionsWithoutStdio",
    "SpawnSyncOptions",
    "SpawnSyncOptionsWithBufferEncoding",
    "SpawnSyncOptionsWithStringEncoding",
    "ExecFileOptions",
    "ExecFileOptionsWithStringEncoding",
    "ExecFileOptionsWithBufferEncoding",
    "ExecFileOptionsWithOtherEncoding",
    "ForkOptions",
    "MessagingOptions",

    // crypto
    "CipherGCMOptions",
    "CipherCCMOptions",
    "CipherOCBOptions",
    "HashOptions",

    // dgram
    "SocketOptions",

    // fs
    "ObjectEncodingOptions",
    "FlagAndOpenMode",
    "ReadStreamOptions",
    "WriteStreamOptions",
    "WatchOptions",
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
]

export default (node, context) => {
    if (
        ts.isInterfaceDeclaration(node)
        && jsoInterfaces.some(name => node.name.text === name)
    ) {
        return `@kotlinx.js.JsPlainObject`
    }

    if (
        ts.isInterfaceDeclaration(node)
        && jsoInterfacesWithGenerics.some(name => node.name.text === name)
    ) {
        return `@kotlinx.js.JsPlainObject_KT_68943`
    }

    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "options"

        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && (
            node.parent.parent.name.text === "exec"

            || node.parent.parent.name.text === "readdir"
            || node.parent.parent.name.text === "readdirSync"
        )
    ) {
        return `@kotlinx.js.JsPlainObject`
    }

    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isParenthesizedTypeNode(node.parent)

        && node.parent.parent
        && ts.isUnionTypeNode(node.parent.parent)

        && node.parent.parent.parent
        && ts.isParameter(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "options"

        && node.parent.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent.parent)
        && (
            node.parent.parent.parent.parent.name.text === "exec"
            || node.parent.parent.parent.parent.name.text === "execFile"

            || node.parent.parent.parent.parent.name.text === "appendFile"
            || node.parent.parent.parent.parent.name.text === "readdir"
            || node.parent.parent.parent.parent.name.text === "readdirSync"
            || node.parent.parent.parent.parent.name.text === "readFile"
            || node.parent.parent.parent.parent.name.text === "readFileSync"
            || node.parent.parent.parent.parent.name.text === "writeFile"
            || node.parent.parent.parent.parent.name.text === "watch"
            || node.parent.parent.parent.parent.name.text === "watchFile"
        )
    ) {
        return `@kotlinx.js.JsPlainObject`
    }

    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isParenthesizedTypeNode(node.parent)

        && node.parent.parent
        && ts.isUnionTypeNode(node.parent.parent)

        && node.parent.parent.parent
        && ts.isParameter(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "options"

        && node.parent.parent.parent.parent
        && ts.isMethodSignature(node.parent.parent.parent.parent)
        && (
            node.parent.parent.parent.parent.name.text === "appendFile"
            || node.parent.parent.parent.parent.name.text === "readFile"
            || node.parent.parent.parent.parent.name.text === "writeFile"
        )
    ) {
        return `@kotlinx.js.JsPlainObject`
    }

    return null
}
