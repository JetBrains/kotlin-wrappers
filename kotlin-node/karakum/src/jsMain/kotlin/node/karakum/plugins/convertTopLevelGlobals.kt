package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isModuleDeclaration
import typescript.isSourceFile

val convertTopLevelGlobals = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull())
        ensure(sourceFileName.fileName.endsWith("globals.d.ts"))

        val sourceFile = ensureNotNull(node.getParentOrNull())
        ensure(isSourceFile(sourceFile))

        ensure(!isNodeJsModuleDeclaration(node))

        ""
    }
}

private fun isNodeJsModuleDeclaration(node: Node): Boolean = nullable {
    ensure(isModuleDeclaration(node))

    val identifier = node.name
    ensure(isIdentifier(identifier))
    ensure(identifier.text == "NodeJS")
} != null
