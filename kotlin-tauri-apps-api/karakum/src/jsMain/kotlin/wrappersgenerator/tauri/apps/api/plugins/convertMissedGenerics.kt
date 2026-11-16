package wrappersgenerator.tauri.apps.api.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode

val convertMissedGenerics = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Uint8Array")
        ensure(node.typeArguments == null)

        "${render(typeName)}<*>"
    }
}
