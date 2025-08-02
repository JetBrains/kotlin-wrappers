package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration

private val overriddenMethods = mapOf(
    // stream
    "Readable" to mapOf(
        "read" to "readOrNull"
    ),

    // http2
    "Http2ServerRequest" to mapOf(
        "read" to "readOrNull"
    ),
)

val convertOverriddenMethodDeclaration = createPlugin { node, context, render ->
    nullable {
        ensure(isMethodDeclaration(node))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        val classOverrides = ensureNotNull(overriddenMethods[className.text])

        val methodName = node.name
        ensure(isIdentifier(methodName))
        val methodOverride = ensureNotNull(classOverrides[methodName.text])

        val name = escapeIdentifier(render(node.name))

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { render(it) }

        val returnType = node.type?.let {render(it) }

        val inheritanceModifierService =
            context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey)

        convertParameterDeclarations(node, context, render, ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = { parameters, signature ->

            val inheritanceModifier = inheritanceModifierService?.resolveSignatureInheritanceModifier(node, signature, context)

            val jsName = if (inheritanceModifier != "override") "@JsName(\"$name\")" else ""

            """
                $jsName
                ${ifPresent(inheritanceModifier) { "$it " }}fun ${ifPresent(typeParameters) { "<$it> " }}${methodOverride}(${parameters})${ifPresent(returnType) { ": $it" }}
            """.trimIndent()
        }))
    }
}
