package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

val convertTypeParameterReferences = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(node.typeArguments == null)

        var parent: Node? = typeScriptService.getParent(node)
        while (parent != null && !isFunctionTypeNode(parent)) {
            parent = typeScriptService.getParent(parent)
        }

        val functionType = ensureNotNull(parent)
        ensure(isFunctionTypeNode(functionType))
        ensure(isVariableDeclaration(ensureNotNull(typeScriptService.getParent(functionType))))

        val typeParameter = ensureNotNull(
            functionType.typeParameters
                ?.asArray()
                ?.singleOrNull { it.name.text == typeName.text },
        )

        val isTypeArgument = typeScriptService.getParent(node)
            ?.let { isTypeReferenceNode(it) }
            ?: false

        if (isTypeArgument) {
            "*"
        } else {
            render(ensureNotNull(typeParameter.constraint))
        }
    }
}
