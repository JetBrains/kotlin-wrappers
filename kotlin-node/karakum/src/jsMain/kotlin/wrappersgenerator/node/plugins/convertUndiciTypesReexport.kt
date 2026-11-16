package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isVariableDeclaration

val convertUndiciTypesReexport = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
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
