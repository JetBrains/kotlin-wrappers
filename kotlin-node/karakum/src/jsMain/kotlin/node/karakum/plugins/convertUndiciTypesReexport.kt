package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertUndiciTypesReexport = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("http.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(
            name.text == "WebSocket" ||
                    name.text == "CloseEvent" ||
                    name.text == "MessageEvent"
        )

        ""
    }
}
