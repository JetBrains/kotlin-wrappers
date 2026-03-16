package wrappersgenerator.testing.library.user.event.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isFunctionDeclaration
import typescript.isIntersectionTypeNode
import typescript.isParameter

val convertUserEventMethodOptions = createPlugin { node, context, render ->
    nullable {
        ensure(isIntersectionTypeNode(node))

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val function = ensureNotNull(parameter.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)

        ensure(
            functionName.text == "tab"
                    || functionName.text == "type"
        )

        val typeScriptService = context.requireService(typeScriptServiceKey)

        val declaration = ensureNotNull(typeScriptService.resolveType(node))

        render(declaration)
    }
}
