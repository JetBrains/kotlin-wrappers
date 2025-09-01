package electron.karakum.plugins

import electron.karakum.plugins.SignatureOverrideConfig.Alias
import electron.karakum.plugins.SignatureOverrideConfig.Overlap
import electron.karakum.plugins.SignatureOverrideConfig.Preserve
import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

private sealed interface SignatureOverrideConfig {
    object Preserve : SignatureOverrideConfig
    class Alias(val alias: String) : SignatureOverrideConfig
    class Overlap(val alias: String, val parentType: String) : SignatureOverrideConfig
}

private val overriddenProps = mapOf<String, Map<String, SignatureOverrideConfig>>(
    "KeyboardInputEvent" to mapOf(
        "type" to Overlap("keyboardType", "InputEventType"),
    ),
    "MouseInputEvent" to mapOf(
        "type" to Overlap("mouseType", "InputEventType"),
    ),
    "MouseWheelInputEvent" to mapOf(
        "type" to Overlap("mouseWheelType", "InputEventType"),
    ),
)

val convertOverriddenPropertySignature = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertySignature(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        val interfaceName = interfaceNode.name
        val interfaceOverrides = ensureNotNull(overriddenProps[interfaceName.text])

        val propertyName = node.name
        ensure(isIdentifier(propertyName))
        val propertyOverride = ensureNotNull(interfaceOverrides[propertyName.text])

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
