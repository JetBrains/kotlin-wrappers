package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.isDeprecated
import js.reflect.invoke
import typescript.isFunctionDeclaration
import typescript.isInterfaceDeclaration

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        ensure(isDeprecated(node))

        val save = isInterfaceDeclaration(node)
                && node.name.text.let { it == "EditorOptions" || it == "FormatCodeOptions" }

        ensure(!save)

        ""
    } ?: nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "isImportTypeAssertionContainer")

        ""
    }
}
