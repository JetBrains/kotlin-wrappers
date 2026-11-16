package wrappersgenerator.tauri.apps.api.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isPrivateIdentifier
import typescript.ast.`is`.isPropertyDeclaration

val convertPrivateIdentifier = createPlugin { node, _, _ ->
    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isPrivateIdentifier(name))

        ""
    }
}
