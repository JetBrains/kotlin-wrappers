package wrappersgenerator.semver.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isClassDeclaration
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isMethodDeclaration

suspend fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName

    ensure(isMethodDeclaration(node))

    val name = node.name
    ensure(isIdentifier(name))

    ensure(sourceFileName.endsWith("semver.d.ts"))
    ensure(name.text == "toString")

    val classNode = ensureNotNull(node.parent)
    ensure(isClassDeclaration(classNode))
    ensure(classNode.name?.text == "SemVer")

    "override"
}
