package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.resolveParenthesizedType
import typescript.SyntaxKind
import typescript.asArray
import typescript.isFunctionTypeNode
import typescript.isUnionTypeNode

// `T | (() => T)`
val convertValueOrGetterUnion = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        ensure(isUnionTypeNode(node))

        val types = node.types.asArray().map(::resolveParenthesizedType)
        ensure(types.size == 2)

        val getter = ensureNotNull(types.singleOrNull(::isFunctionTypeNode))
        ensure(isFunctionTypeNode(getter))
        ensure(getter.parameters.asArray().isEmpty())

        val getterReturnType = typeChecker.getTypeFromTypeNode(getter.type)
        val value = ensureNotNull(types.singleOrNull { typeChecker.getTypeFromTypeNode(it) === getterReturnType })

        if (value.kind == SyntaxKind.VoidKeyword) {
            "(${render(getter)})?"
        } else {
            render(getter)
        }
    }
}
