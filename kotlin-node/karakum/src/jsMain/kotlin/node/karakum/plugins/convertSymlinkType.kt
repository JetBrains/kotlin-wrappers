package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isModuleBlock
import typescript.isModuleDeclaration
import typescript.isQualifiedName
import typescript.isTypeAliasDeclaration

val convertSymlinkType = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))

        val moduleBlock = ensureNotNull(typeAlias.getParentOrNull())
        ensure(isModuleBlock(moduleBlock))

        val module = ensureNotNull(moduleBlock.getParentOrNull())
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
