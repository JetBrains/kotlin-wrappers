package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isMethodSignature

val convertGenericBuiltinModule = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("process.d.ts"))

        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "getBuiltinModule")

        ensureNotNull(node.typeParameters)

        ""
    }
}
