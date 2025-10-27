package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isTypeReferenceNode

val convertFunctionInheritance = createPlugin { node, context, _ ->
    val typeScriptService = context.lookupService(typeScriptServiceKey)

    nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "DebugLoggerFunction")

        "js.function.JsFunction<js.array.Tuple1<String>, Unit> /* ${typeScriptService?.printNode(node)} */"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "REPLWriter")

        val intersectionType = ensureNotNull(node.getParentOrNull())
        ensure(isIntersectionTypeNode(intersectionType))

        "js.function.JsFunction<js.array.Tuple1<Any?>, String> /* ${typeScriptService?.printNode(node)} */"
    }
}
