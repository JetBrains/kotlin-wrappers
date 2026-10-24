package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertSymlinkType = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))

        val typeAlias = ensureNotNull(node.parent)
        ensure(isTypeAliasDeclaration(typeAlias))

        val moduleBlock = ensureNotNull(typeAlias.parent)
        ensure(isModuleBlock(moduleBlock))

        val module = ensureNotNull(moduleBlock.parent)
        ensure(isModuleDeclaration(module))

        val moduleName = module.name
        ensure(isIdentifier(moduleName))
        ensure(moduleName.text == "symlink")

        "SymlinkType"
    } ?: nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "symlink")

        ensure(node.right.text == "Type")

        "SymlinkType"
    }
}
