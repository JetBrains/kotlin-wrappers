package wrappersgenerator.node.injections

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.MEMBER
import io.github.sgrishchenko.karakum.extension.createInjection
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isInterfaceDeclaration

val injectAgentOptionsPort = createInjection { node, context, _ ->
    nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("https.d.ts"))

        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text == "AgentOptions")

        arrayOf(
            """
                @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
                override var port: Double
            """.trimIndent()
        )
    }
}
