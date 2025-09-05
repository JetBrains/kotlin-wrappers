package node.karakum.injections

import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.createInjection
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.Raise
import arrow.core.raise.nullable
import typescript.isInterfaceDeclaration

val injectAgentOptionsPort = createInjection { node, context, _ ->
    nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("https.d.ts"))

        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text == "AgentOptions")

        arrayOf("override var port: dynamic")
    }
}
