package semver.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName

    ensure(isMethodDeclaration(node))

    val name = node.name
    ensure(isIdentifier(name))

    ensure(sourceFileName.endsWith("semver.d.ts"))
    ensure(name.text == "toString")

    val classNode = ensureNotNull(node.getParentOrNull())
    ensure(isClassDeclaration(classNode))
    ensure(classNode.name?.text == "SemVer")

    "override"
}
