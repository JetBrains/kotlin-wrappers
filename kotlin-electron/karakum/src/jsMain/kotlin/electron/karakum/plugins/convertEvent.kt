package electron.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import typescript.asArray
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

val convertEvent = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "Event")

        val type = node.type
        ensure(isIntersectionTypeNode(type))

        val firstType = type.types.asArray().first()
        ensure(isTypeLiteralNode(firstType))

        val inheritanceModifierService =
            ensureNotNull(context.lookupService(inheritanceModifierServiceKey))

        val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)

        val typeParameters = node.typeParameters?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(", ")

        val members = firstType.members.asArray()
            .joinToString("\n") { render(it) }

        """
            ${ifPresent(inheritanceModifier) { "$it " }}external interface Event${ifPresent(typeParameters) { "<${it}>" }} {
            $members

            @Suppress(
                "WRONG_BODY_OF_EXTERNAL_DECLARATION",
                "INLINE_EXTERNAL_DECLARATION",
                "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
                "DECLARATION_CANT_BE_INLINED",
            )

            inline val params: Params
                get() = unsafeCast<Params>()
            }
        """.trimIndent()
    }
}
