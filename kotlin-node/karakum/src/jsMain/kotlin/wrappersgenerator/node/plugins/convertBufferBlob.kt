package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertBufferBlob = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("buffer.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "Blob")

        ""
    }
}
