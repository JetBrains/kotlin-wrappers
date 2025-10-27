package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.asArray
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

val convertMock = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "Mock")

        val intersection = node.type
        ensure(isIntersectionTypeNode(intersection))
        ensure(intersection.types.asArray().size > 1)

        val firstType = intersection.types.asArray()[1]
        ensure(isTypeLiteralNode(firstType))

        val inheritanceModifierService =
            ensureNotNull(context.lookupService(inheritanceModifierServiceKey))

        val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)

        val typeParameters = node.typeParameters?.asArray()
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(", ")

        val members = firstType.members.asArray().joinToString("\n") { render(it) }

        """
            ${ifPresent(inheritanceModifier) { "$it "}}external interface Mock${ifPresent(typeParameters) { "<$it>"}} {
            $members

            @Suppress(
                "WRONG_BODY_OF_EXTERNAL_DECLARATION",
                "INLINE_EXTERNAL_DECLARATION",
                "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
                "DECLARATION_CANT_BE_INLINED",
            )
            inline val fn: F
                get() = unsafeCast<F>()
            }
        """.trimIndent()
    }
}
