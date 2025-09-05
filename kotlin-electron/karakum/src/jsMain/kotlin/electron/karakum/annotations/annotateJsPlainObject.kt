package electron.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isParameter

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    ensure(context.isAnonymousDeclaration)

    ensure(isIntersectionTypeNode(node))

    val parameter = ensureNotNull(node.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = ensureNotNull(parameter.name)
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "init")

    nullable {
        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "fetch")

        val interfaceNode = ensureNotNull(method.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Net")

        "@js.objects.JsPlainObject"
    } ?: nullable {
        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodDeclaration(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "fetch")

        val classNode = ensureNotNull(method.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "Session")

        "@js.objects.JsPlainObject"
    }
}
