package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isMethodSignature

val convertGenericBuiltinModule = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("process.d.ts"))

        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "getBuiltinModule")

        ensureNotNull(node.typeParameters)

        ""
    }
}
