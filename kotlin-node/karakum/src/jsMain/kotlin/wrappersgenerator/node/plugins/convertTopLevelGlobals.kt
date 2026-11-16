package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isInterfaceDeclaration
import typescript.ast.`is`.isVariableDeclaration

val convertTopLevelGlobals = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
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
