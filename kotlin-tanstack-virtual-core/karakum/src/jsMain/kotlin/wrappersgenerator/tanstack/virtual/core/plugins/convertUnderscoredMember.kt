package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyDeclaration

// `_didMount` / `_willUpdate`
val convertUnderscoredMember = createPlugin { node, _, _ ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text.startsWith("_"))

        ""
    }
}
