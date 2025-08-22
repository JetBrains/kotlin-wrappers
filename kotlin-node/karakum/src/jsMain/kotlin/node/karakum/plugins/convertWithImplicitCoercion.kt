package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.createPlugin
import node.karakum.util.nullable
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertWithImplicitCoercion = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "WithImplicitCoercion" || typeName.text == "ImplicitArrayBuffer")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    }
}
