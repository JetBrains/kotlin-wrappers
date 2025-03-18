package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.createSimplePlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertAssertStrict = createSimplePlugin plugin@{ node: Node, _, _ ->
    val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"

    if (!sourceFileName.endsWith("assert.d.ts")) return@plugin null
    if (!isVariableDeclaration(node)) return@plugin null

    val name = node.name
    if (!isIdentifier(name)) return@plugin null

    if (name.text === "strict") return@plugin ""

    null
}
