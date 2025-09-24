package semver.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.isClassDeclaration
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isPropertyDeclaration

private val versionParts = setOf("major", "minor", "patch")

val convertVersionPartTypes = createPlugin { node, _, _ ->
    nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val property = ensureNotNull(node.getParentOrNull())
        ensure(isPropertyDeclaration(property))

        val propertyName = property.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text in versionParts)

        val classNode = ensureNotNull(property.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "SemVer")

        "Int"
    } ?: nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val function = ensureNotNull(node.getParentOrNull())
        ensure(isFunctionDeclaration(function))
        ensure(function.name?.text in versionParts)
        ensure(function.type === node)

        "Int"
    }
}
