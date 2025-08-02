package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.InjectionService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import io.github.sgrishchenko.karakum.extension.plugins.injectionServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.asArray
import typescript.isConditionalTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

val convertParsedResults = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("util.d.ts"))

        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "ParsedResults")

        val type = node.type
        ensure(isConditionalTypeNode(type))

        val trueType = type.trueType
        ensure(isTypeLiteralNode(trueType))

        val inheritanceModifierService =
            ensureNotNull(context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey))

        val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(trueType, context)

        val name = render(node.name)

        val typeParameters = node.typeParameters?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(", ")

        val injectionService = ensureNotNull(context.lookupService<InjectionService>(injectionServiceKey))

        val injections = injectionService.resolveInjections(trueType, InjectionType.MEMBER, context, render)

        val members = trueType.members.asArray().joinToString("\n") { render(it) }

        val injectedMembers = injections.joinToString("\n")

        """
            ${ifPresent(inheritanceModifier) { "$it " }}external interface ${name}${ifPresent(typeParameters) { "<${it}>" }} {
            ${members}${ifPresent(injectedMembers) { "\n${it}" }}
            }
        """.trimIndent()
    }
}
