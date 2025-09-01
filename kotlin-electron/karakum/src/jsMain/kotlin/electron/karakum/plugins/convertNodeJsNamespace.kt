package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.isIdentifier
import typescript.isModuleDeclaration

val convertNodeJsNamespace = createPlugin { node, context, _ ->
    nullable {
        ensure(isModuleDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "NodeJS")

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        "/* ${typeScriptService.printNode(node)} */"
    }
}
