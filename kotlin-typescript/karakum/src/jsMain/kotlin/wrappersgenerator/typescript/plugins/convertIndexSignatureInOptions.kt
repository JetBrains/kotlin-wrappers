package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIndexSignatureDeclaration
import typescript.isInterfaceDeclaration

val convertIndexSignatureInOptions = createPlugin { node, context, _ ->
    nullable {
        ensure(isIndexSignatureDeclaration(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "BuildOptions"
                    || interfaceNode.name.text == "CompilerOptions"
                    || interfaceNode.name.text == "WatchOptions"
        )

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        "/* ${typeScriptService.printNode(node)} */"
    }
}
