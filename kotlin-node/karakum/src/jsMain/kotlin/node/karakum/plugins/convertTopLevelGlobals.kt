package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isVariableDeclaration

val convertTopLevelGlobals = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("globals.d.ts"))

        nullable {
            ensure(isInterfaceDeclaration(node))
            ensure(node.name.text == "ErrorConstructor")

            ""
        } ?: nullable {
            ensure(isVariableDeclaration(node))

            val name = node.name
            ensure(isIdentifier(name))
            ensure(
                name.text == "global"
                        || name.text == "process"
                        || name.text == "console"
            )

            ""
        }
    }
}
