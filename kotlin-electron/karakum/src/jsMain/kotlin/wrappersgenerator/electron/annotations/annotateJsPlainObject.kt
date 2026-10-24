package wrappersgenerator.electron.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.*

suspend fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    ensure(context.isAnonymousDeclaration)

    ensure(isIntersectionTypeNode(node))

    val parameter = ensureNotNull(node.parent)
    ensure(isParameter(parameter))

    val parameterName = ensureNotNull(parameter.name)
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "init")

    nullable {
        val method = ensureNotNull(parameter.parent)
        ensure(isMethodSignature(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "fetch")

        val interfaceNode = ensureNotNull(method.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Net")

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        val method = ensureNotNull(parameter.parent)
        ensure(isMethodDeclaration(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "fetch")

        val classNode = ensureNotNull(method.parent)
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "Session")

        "@kotlinx.js.JsPlainObject"
    }
}
