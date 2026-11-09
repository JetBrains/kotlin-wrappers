package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.getJSDocDeprecatedTag
import typescript.isEnumMember
import typescript.isFunctionDeclaration
import typescript.isInterfaceDeclaration

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        // TODO: fix in core?
        val tagOwner = node.parent
            .takeIf { isEnumMember(it) }
            ?: node

        ensureNotNull(getJSDocDeprecatedTag(tagOwner))

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
