package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration

val convertStreamDestroy = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isMethodDeclaration(node))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(
            classNode.name?.text == "Readable"
                    ||classNode.name?.text == "Writable"
        )

        val methodName = node.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "destroy")

        val name = escapeIdentifier(render(node.name))

        val typeParameters = node.typeParameters?.asArray()?.joinToString(", ") { render(it) }

        val returnType = node.type?.let { render(it) }

        val additionalSignature = "open fun destroy(): Unit /* this */"

        val mainSignature = convertParameterDeclarations(node, context, render, ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            defaultValue = "", // remove default value to provide multiple inheritance in Duplex
            template = { parameters, _ ->
                "open fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
            }
        ))

        arrayOf(
            additionalSignature,
            mainSignature,
        ).joinToString("\n\n")
    }
}
