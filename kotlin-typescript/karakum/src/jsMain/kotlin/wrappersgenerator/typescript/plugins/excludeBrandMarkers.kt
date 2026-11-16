package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isPropertySignature

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
