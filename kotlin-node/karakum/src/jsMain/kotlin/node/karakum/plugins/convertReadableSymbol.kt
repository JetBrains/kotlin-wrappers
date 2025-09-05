package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isClassDeclaration
import typescript.isComputedPropertyName
import typescript.isMethodDeclaration

val convertReadableSymbol = createPlugin { node, context, _ ->
    nullable {
        ensure(isMethodDeclaration(node))

        val name = node.name
        ensure(isComputedPropertyName(name))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "Readable")

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        "/* ${typeScriptService.printNode(node)} */"
    }
}
