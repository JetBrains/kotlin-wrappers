package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

private val incompatibleParameterNames = mapOf(
    "LanguageServiceHost" to mapOf(
        "fileExists" to mapOf(
            "path" to "fileName",
        ),
        "getDirectories" to mapOf(
            "directoryName" to "path",
        ),
    ),

    "ParseConfigHost" to mapOf(
        "fileExists" to mapOf(
            "path" to "fileName",
        ),
        "readFile" to mapOf(
            "path" to "fileName",
        ),
    ),
)

val convertIncompatibleParameterName = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))
        ensure(parameter.name === node)

        val method = ensureNotNull(parameter.parent)
        ensure(isMethodDeclaration(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))

        val classNode = ensureNotNull(method.parent)
        ensure(isClassDeclaration(classNode))

        val classIncompatibleParameterNames = ensureNotNull(incompatibleParameterNames[classNode.name?.text])
        val methodIncompatibleParameterNames = ensureNotNull(classIncompatibleParameterNames[methodName.text])
        val alias = ensureNotNull(methodIncompatibleParameterNames[node.text])

        alias
    } ?: nullable {
        ensure(isIdentifier(node))

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))
        ensure(parameter.name === node)

        val method = ensureNotNull(parameter.parent)
        ensure(isMethodSignature(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))

        val interfaceNode = ensureNotNull(method.parent)
        ensure(isInterfaceDeclaration(interfaceNode))

        val interfaceIncompatibleParameterNames = ensureNotNull(incompatibleParameterNames[interfaceNode.name.text])
        val methodIncompatibleParameterNames = ensureNotNull(interfaceIncompatibleParameterNames[methodName.text])
        val alias = ensureNotNull(methodIncompatibleParameterNames[node.text])

        alias
    }
}
