package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.resolveParenthesizedType
import js.reflect.invoke
import typescript.SyntaxKind
import typescript.isFunctionTypeNode
import typescript.isUnionTypeNode

// `T | (() => T)`
val convertValueOrGetterUnion = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = context.requireService(typeScriptServiceKey)
        val typeChecker = typeScriptService.program.getTypeChecker()

        ensure(isUnionTypeNode(node))

        val types = node.types.map(::resolveParenthesizedType)
        ensure(types.size == 2)

        val getter = ensureNotNull(types.singleOrNull { isFunctionTypeNode(it) })
        ensure(isFunctionTypeNode(getter))
        ensure(getter.parameters.isEmpty())

        val getterReturnType = typeChecker.getTypeFromTypeNode(getter.type)
        val value = ensureNotNull(types.singleOrNull { typeChecker.getTypeFromTypeNode(it) === getterReturnType })

        if (value.kind == SyntaxKind.VoidKeyword) {
            "(${render(getter)})?"
        } else {
            render(getter)
        }
    }
}
