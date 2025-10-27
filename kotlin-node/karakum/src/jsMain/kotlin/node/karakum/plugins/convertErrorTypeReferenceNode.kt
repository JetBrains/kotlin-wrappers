package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertErrorTypeReferenceNode = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "Error")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        val namespace = ensureNotNull(typeScriptService.findClosestNamespace(node))

        val namespaceName = namespace.name
        ensure(isIdentifier(namespaceName))
        ensure(namespaceName.text == "EventData")

        "node.test.eventData.Error"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "Error")

        "js.errors.JsError"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "Error")

        "js.errors.JsError"
    }
}
