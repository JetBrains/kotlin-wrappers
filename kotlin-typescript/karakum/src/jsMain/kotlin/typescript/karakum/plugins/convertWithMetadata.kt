package typescript.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import typescript.asArray
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

val convertWithMetadata = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "WithMetadata")

        val intersection = node.type
        ensure(isIntersectionTypeNode(intersection))
        ensure(intersection.types.asArray().size > 1)

        val secondType = intersection.types.asArray()[1]
        ensure(isTypeLiteralNode(secondType))

        val inheritanceModifierService =
            ensureNotNull(context.lookupService(inheritanceModifierServiceKey))

        val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)

        val typeParameters = node.typeParameters?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(", ")

        val members = secondType.members.asArray().joinToString("\n") { render(it) }

        """
            ${ifPresent(inheritanceModifier) { "$it "}}external interface WithMetadata${ifPresent(typeParameters) { "<$it>"}} {
            $members

            @Suppress(
                "WRONG_BODY_OF_EXTERNAL_DECLARATION",
                "INLINE_EXTERNAL_DECLARATION",
                "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
                "DECLARATION_CANT_BE_INLINED",
            )
            inline val value: T
                get() = unsafeCast<T>()
            }
        """.trimIndent()
    }
}
