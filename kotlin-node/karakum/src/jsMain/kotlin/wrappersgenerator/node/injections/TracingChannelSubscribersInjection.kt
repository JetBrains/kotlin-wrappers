package wrappersgenerator.node.injections

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import js.reflect.invoke
import typescript.*

class TracingChannelSubscribersInjection : Injection {
    override suspend fun setup(context: Context) = Unit

    override suspend fun traverse(node: Node, context: Context) = Unit

    override suspend fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "ContextType")

        val intersection = ensureNotNull(node.parent)
        ensure(isIntersectionTypeNode(intersection))

        val parameter = ensureNotNull(intersection.parent)
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "message")

        ""
    }

    override suspend fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

        ensure(isIntersectionTypeNode(node))

        val parameter = ensureNotNull(node.parent)
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

    override suspend fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
