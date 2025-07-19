package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isVariableDeclaration

val convertUndiciTypesReexport = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull())
        ensure(sourceFileName.fileName.endsWith("http.d.ts"))

        ensure(isVariableDeclaration(node))
        val identifier = node.name
        ensure(isIdentifier(identifier))
        ensure(
            identifier.text == "WebSocket" ||
                    identifier.text == "CloseEvent" ||
                    identifier.text == "MessageEvent"
        )

        ""
    }
}
