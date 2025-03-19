package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createSimplePlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertAssertStrict = createSimplePlugin { node: Node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()?.fileName)

        ensure(sourceFileName.endsWith("assert.d.ts"))
        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        ensure(name.text === "strict")

        ""
    }
}
