package typescript.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InjectionService
import io.github.sgrishchenko.karakum.extension.plugins.injectionServiceKey
import typescript.asArray
import typescript.isEnumDeclaration
import typescript.isIdentifier

val convertKindEnums = createPlugin { node, context, render ->
    nullable {
        ensure(isEnumDeclaration(node))
        ensure(
            node.name.text == "SyntaxKind"
                    || node.name.text == "ScriptKind"
                    || node.name.text == "TypePredicateKind"
                    || node.name.text == "InvalidatedProjectKind"
                    || node.name.text == "CommandTypes"
        )

        val name = render(node.name)

        val injectionService = ensureNotNull(context.lookupService(injectionServiceKey))

        val heritageInjections = injectionService.resolveInjections(node, InjectionType.HERITAGE_CLAUSE, context, render)

        val injectedHeritageClauses = heritageInjections
            .filter { it.isNotEmpty() }
            .joinToString(", ")

        val members = node.members.asArray()
            .joinToString("\n") { member ->
                val memberName = member.name

                val type = if (isIdentifier(memberName)) memberName.text else name

                "${render(member)}: $type"
            }

        val body = node.members.asArray()
            .joinToString("\n") { member ->
                val memberHeritageInjections =
                    injectionService.resolveInjections(member, InjectionType.HERITAGE_CLAUSE, context, render)

                val memberInjectedHeritageClauses = memberHeritageInjections
                    .filter { it.isNotEmpty() }
                    .joinToString(", ")

                val heritageClauses = arrayOf(name, memberInjectedHeritageClauses)
                    .filter { it.isNotEmpty() }
                    .joinToString(", ")

                "sealed interface ${render(member.name)}${ifPresent(heritageClauses) { " : $it" }}"
            }

        """
             sealed external interface ${name}${ifPresent(injectedHeritageClauses) { " : $it" }} {
             $body

             companion object {
             $members
             }
             }
        """.trimIndent()
    }
}
