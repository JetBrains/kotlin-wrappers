package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import node.karakum.plugins.DeclarationOverrideConfig.Alias
import node.karakum.plugins.DeclarationOverrideConfig.Overlap
import node.karakum.plugins.DeclarationOverrideConfig.Preserve
import typescript.SyntaxKind
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isPropertyDeclaration


private sealed interface DeclarationOverrideConfig {
    object Preserve : DeclarationOverrideConfig
    class Alias(val alias: String) : DeclarationOverrideConfig
    class Overlap(val alias: String, val parentType: String) : DeclarationOverrideConfig
}

private val overriddenProps = mapOf(
    // net
    "Socket" to mapOf(
        "destroyed" to Alias("netSocketDestroyed")
    ),

    // perf_hooks
    "PerformanceMark" to mapOf(
        "duration" to Preserve,
        "entryType" to Overlap("markEntryType", "EntryType")
    ),
    "PerformanceMeasure" to mapOf(
        "entryType" to Overlap("measureEntryType", "EntryType")
    ),
    "PerformanceNodeTiming" to mapOf(
        "entryType" to Overlap("nodeTimingEntryType", "EntryType")
    ),
    "PerformanceResourceTiming" to mapOf(
        "entryType" to Overlap("resourceTimingEntryType", "EntryType")
    ),

    // stream
    "Readable" to mapOf(
        "readable" to Preserve
    ),
    "Writable" to mapOf(
        "writable" to Alias("readonlyWritable")
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
    )
)

val convertOverriddenPropertyDeclaration = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        val classOverrides = ensureNotNull(overriddenProps[className.text])

        val propertyName = node.name
        ensure(isIdentifier(propertyName))
        val propertyOverride = ensureNotNull(classOverrides[propertyName.text])

        val readonly = node.modifiers?.asArray()?.find { it.kind == SyntaxKind.ReadonlyKeyword }

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
        }
    }
}
