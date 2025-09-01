package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertUtilityTypes = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Partial")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    }
}
