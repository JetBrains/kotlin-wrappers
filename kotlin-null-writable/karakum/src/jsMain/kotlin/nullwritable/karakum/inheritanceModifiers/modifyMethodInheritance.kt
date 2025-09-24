package nullwritable.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(isMethodDeclaration(node))

    val name = node.name
    ensure(isIdentifier(name))
    ensure(
        name.text == "_write"
                || name.text == "_writev"
    )

    val classNode = ensureNotNull(node.getParentOrNull())
    ensure(isClassDeclaration(classNode))
    ensure(classNode.name?.text == "NullWritable")

    "override"
}
