package karakum.tauri.apps.api.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isPrivateIdentifier
import typescript.isPropertyDeclaration

val convertPrivateIdentifier = createPlugin { node, _, _ ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isPrivateIdentifier(name))

        ""
    }
}
