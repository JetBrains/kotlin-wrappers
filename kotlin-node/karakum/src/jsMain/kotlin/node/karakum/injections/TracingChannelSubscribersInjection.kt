package node.karakum.injections

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Injection
import io.github.sgrishchenko.karakum.extension.InjectionContext
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.Raise
import arrow.core.raise.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isParameter
import typescript.isTypeReferenceNode

class TracingChannelSubscribersInjection : Injection {
    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = Unit

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "ContextType")

        val intersection = ensureNotNull(node.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val parameter = ensureNotNull(intersection.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "message")

        ""
    }

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

        ensure(isIntersectionTypeNode(node))

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "message")

        arrayOf("""
            @Suppress(
                "WRONG_BODY_OF_EXTERNAL_DECLARATION",
                "INLINE_EXTERNAL_DECLARATION",
                "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
                "DECLARATION_CANT_BE_INLINED",
            )
            inline val contextType: ContextType
                get() = unsafeCast<ContextType>()
        """.trimIndent())
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
