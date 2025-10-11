package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import node.karakum.plugins.SignatureOverrideConfig.Alias
import node.karakum.plugins.SignatureOverrideConfig.Preserve
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

private sealed interface SignatureOverrideConfig {
    object Preserve : SignatureOverrideConfig
    class Alias(val alias: String) : SignatureOverrideConfig
}

private val overriddenProps = mapOf(
    // child_process
    "ChildProcessByStdio" to mapOf(
        "stdin" to Alias("boundStdin"),
        "stdout" to Alias("boundStdout"),
        "stderr" to Alias("boundStderr"),
        "stdio" to Alias("boundStdio"),
    ),
    "ChildProcessWithoutNullStreams" to mapOf(
        "stdin" to Alias("requiredStdin"),
        "stdout" to Alias("requiredStdout"),
        "stderr" to Alias("requiredStderr"),
        "stdio" to Alias("requiredStdio"),
    ),
    "ExecFileOptions" to mapOf(
        "signal" to Preserve,
    ),
    "ExecFileSyncOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("bufferEncoding"),
    ),
    "ExecFileSyncOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "ExecSyncOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("bufferEncoding"),
    ),
    "ExecSyncOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "ExecFileOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("bufferEncoding"),
    ),
    "ExecFileOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "ExecOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("bufferEncoding"),
    ),
    "ExecOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "SpawnSyncOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("bufferEncoding"),
    ),
    "SpawnSyncOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "SpawnOptionsWithStdioTuple" to mapOf(
        "stdio" to Alias("stdioTuple"),
    ),
    "SpawnOptionsWithoutStdio" to mapOf(
        "stdio" to Preserve,
    ),

    // crypto
    "GeneratePrimeOptionsArrayBuffer" to mapOf(
        "bigint" to Preserve,
    ),
    "GeneratePrimeOptionsBigInt" to mapOf(
        "bigint" to Alias("requiredBigInt"),
    ),
    "OneShotDigestOptionsWithBufferEncoding" to mapOf(
        "outputEncoding" to Alias("bufferOutputEncoding"),
    ),
    "OneShotDigestOptionsWithStringEncoding" to mapOf(
        "outputEncoding" to Alias("stringOutputEncoding"),
    ),

    // dns
    "LookupAllOptions" to mapOf(
        "all" to Alias("requiredAll"),
    ),
    "LookupOneOptions" to mapOf(
        "all" to Preserve,
    ),
    "ResolveWithTtlOptions" to mapOf(
        "ttl" to Preserve,
    ),

    // fs
    "GlobOptions" to mapOf(
        "exclude" to Alias("globExclude"),
    ),
    "GlobOptionsWithFileTypes" to mapOf(
        "exclude" to Alias("excludeWithFileTypes"),
        "withFileTypes" to Alias("requiredWithFileTypes")
    ),
    "GlobOptionsWithoutFileTypes" to mapOf(
        "exclude" to Alias("excludeWithoutFileTypes"),
        "withFileTypes" to Preserve
    ),
    "WatchOptionsWithBufferEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),
    "WatchOptionsWithStringEncoding" to mapOf(
        "encoding" to Alias("stringEncoding"),
    ),

    // http
    "AgentOptions" to mapOf(
        "keepAlive" to Preserve
    ),

    // http2
    "Http2Stream" to mapOf(
        "closed" to Preserve,
        "destroyed" to Alias("readonlyDestroyed")
    ),

    // tls
    "TlsOptions" to mapOf(
        "sessionTimeout" to Preserve,
        "ticketKeys" to Preserve,
    ),

    // url
    "UrlWithParsedQuery" to mapOf(
        "query" to Alias("parsedQuery"),
    ),
    "UrlWithStringQuery" to mapOf(
        "query" to Alias("stringQuery"),
    ),
)

val convertOverriddenPropertySignature = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertySignature(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        val interfaceOverrides = ensureNotNull(overriddenProps[interfaceNode.name.text])

        val propertyName = node.name
        ensure(isIdentifier(propertyName))
        val propertyOverride = ensureNotNull(interfaceOverrides[propertyName.text])

        val readonly = node.modifiers?.asArray()?.find { it.kind == SyntaxKind.ReadonlyKeyword }

        val modifier = if (readonly != null) "val " else "var "

        val name = render(node.name)

        val isOptional = node.questionToken != null

        val type = renderNullable(node.type, isOptional, context, render)

        when (propertyOverride) {
            is Alias -> {
                val alias = propertyOverride.alias
                val jsName = "@JsName(\"$name\")"
                val aliasSignature = "${modifier}${alias}: $type"

                arrayOf(
                    jsName,
                    aliasSignature,
                ).joinToString("\n")
            }
            Preserve -> "override ${modifier}${name}: $type"
        }
    }
}
