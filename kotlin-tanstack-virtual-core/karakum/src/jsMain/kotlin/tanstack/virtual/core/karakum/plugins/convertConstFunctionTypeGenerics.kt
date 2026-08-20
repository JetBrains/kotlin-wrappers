package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.lambda
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.isFunctionTypeNode
import typescript.isVariableDeclaration

// `const windowScroll: <T extends Window>(...) => void`
val convertConstFunctionTypeGenerics = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        ensure(isFunctionTypeNode(node))
        ensureNotNull(node.typeParameters)

        val parent = ensureNotNull(typeScriptService.getParent(node))
        ensure(isVariableDeclaration(parent))

        val returnType = render(node.type)

        convertParameterDeclarations(
            node, context, render,
            ParameterDeclarationStrategy.lambda,
        ) { parameters, _ ->
            "($parameters) -> $returnType"
        }
    }
}
