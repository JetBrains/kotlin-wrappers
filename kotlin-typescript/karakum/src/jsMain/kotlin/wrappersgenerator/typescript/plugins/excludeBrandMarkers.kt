package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isPropertySignature

val excludeBrandMarkers = createPlugin { node, _, _ ->
    nullable {
        ensure(isPropertySignature(node))
        val nameNode = node.name
        ensure(isIdentifier(nameNode))
        val name = nameNode.text
        ensure(name.startsWith("_"))
        ensure(name.endsWith("Brand"))

        ""
    }
}
