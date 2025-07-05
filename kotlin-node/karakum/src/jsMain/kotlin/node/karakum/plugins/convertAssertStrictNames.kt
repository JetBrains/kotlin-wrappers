package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isFunctionDeclaration
import typescript.isIdentifier

private val renamedFunctions = mapOf(
    "strictEqual" to "equal",
    "notStrictEqual" to "notEqual",
    "deepStrictEqual" to "deepEqual",
    "notDeepStrictEqual" to "notDeepEqual",
)

val convertAssertStrictNames = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("assert.d.ts"))

        ensure(isIdentifier(node))
        ensure(node.text in renamedFunctions)

        val function = node.parent
        ensure(isFunctionDeclaration(function))
        ensure(function.name == node)

        renamedFunctions[node.text]
    }
}
