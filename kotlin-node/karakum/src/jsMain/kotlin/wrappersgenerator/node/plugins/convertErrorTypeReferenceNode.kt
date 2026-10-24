package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertErrorTypeReferenceNode = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
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
    }
}
