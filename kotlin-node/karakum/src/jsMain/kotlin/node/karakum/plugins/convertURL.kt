package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isClassDeclaration

val convertURL = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("url.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "URL")

        // remove from conversion to avoid file creation for anonymous declarations
        ""
    }
}
