package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import js.reflect.invoke
import typescript.*
import wrappersgenerator.node.plugins.DeclarationOverrideConfig.*


private sealed interface DeclarationOverrideConfig {
    object Preserve : DeclarationOverrideConfig
    class Alias(val alias: String) : DeclarationOverrideConfig
    class Overlap(val alias: String, val parentType: String) : DeclarationOverrideConfig
    object Remove : DeclarationOverrideConfig
}

private val overriddenProps = mapOf(
    // net
    "Socket" to mapOf(
        "destroyed" to Alias("netSocketDestroyed"),
    ),

    // perf_hooks
    "PerformanceNodeTiming" to mapOf(
        "entryType" to Remove,
    ),

    // stream
    "Readable" to mapOf(
        "readable" to Preserve,
    ),
    "Writable" to mapOf(
        "writable" to Alias("readonlyWritable"),
    ),
    "Duplex" to mapOf(
        "writable" to Alias("duplexWritable"),
        "writableEnded" to Preserve,
        "writableFinished" to Preserve,
        "writableHighWaterMark" to Preserve,
        "writableLength" to Preserve,
        "writableObjectMode" to Preserve,
        "writableCorked" to Preserve,
        "writableNeedDrain" to Preserve,
        "closed" to Preserve,
        "errored" to Preserve,
    ),
)

val convertOverriddenPropertyDeclaration = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val classNode = ensureNotNull(node.parent)
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        val classOverrides = ensureNotNull(overriddenProps[className.text])

        val propertyName = node.name
        ensure(isIdentifier(propertyName))
        val propertyOverride = ensureNotNull(classOverrides[propertyName.text])

        val readonly = node.modifiers?.find { it.kind == SyntaxKind.ReadonlyKeyword }

        val modifier = if (readonly != null) "val " else "var "

        val name = render(node.name)

        val isOptional = node.questionToken != null

        val type = renderNullable(node.type, isOptional, context, render)

        when (propertyOverride) {
            is Overlap -> {
                val alias = propertyOverride.alias
                val jsName = "@JsName(\"$name\")"
                val aliasSignature = "${modifier}${alias}: $type"
                val deprecation = "@Deprecated(message = \"use ${alias}\", level = DeprecationLevel.HIDDEN)"
                val signature = "override ${modifier}${name}: ${propertyOverride.parentType}"

                arrayOf(
                    deprecation,
                    signature,
                    jsName,
                    aliasSignature,
                ).joinToString("\n")
            }

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
            Remove -> ""
        }
    }
}
