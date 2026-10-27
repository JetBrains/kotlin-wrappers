package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

private data class ParameterNameReplacement(
    val name: String,
    val declarationPredicate: (MethodDeclaration) -> Boolean = { true },
    val signaturePredicate: (MethodSignature) -> Boolean = { true },
)

private val incompatibleParameterNames = mapOf(
    // globals
    "ReadableStream" to mapOf(
        "wrap" to mapOf(
            "oldStream" to ParameterNameReplacement("stream"),
        ),
    ),

    // stream
    "Duplex" to mapOf(
        "write" to mapOf(
            "cb" to ParameterNameReplacement("callback"),
        ),
    ),

    // net
    "Socket" to mapOf(
        "end" to mapOf(
            "callback" to ParameterNameReplacement("cb"),
            "buffer" to ParameterNameReplacement("data"),
        )
    ),

    // http
    "ClientRequest" to mapOf(
        "setTimeout" to mapOf(
            "timeout" to ParameterNameReplacement("msecs"),
        )
    ),

    // http2
    "Http2ServerResponse" to mapOf(
        "end" to mapOf(
            "callback" to ParameterNameReplacement("cb"),
            "data" to ParameterNameReplacement("str", declarationPredicate = { it.parameters.size == 3 }),
        )
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

        val classNode = ensureNotNull(method.parent)
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        val classReplacement = ensureNotNull(incompatibleParameterNames[className.text])

        val methodName = method.name
        ensure(isIdentifier(methodName))
        val methodReplacement = ensureNotNull(classReplacement[methodName.text])

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        val parameterReplacement = ensureNotNull(methodReplacement[parameterName.text])

        ensure(parameterReplacement.declarationPredicate(method))

        parameterReplacement.name
    } ?: nullable {
        ensure(isIdentifier(node))

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))
        ensure(parameter.name === node)

        val method = ensureNotNull(parameter.parent)
        ensure(isMethodSignature(method))

        val interfaceNode = ensureNotNull(method.parent)
        ensure(isInterfaceDeclaration(interfaceNode))

        val interfaceName = ensureNotNull(interfaceNode.name)
        val interfaceReplacement = ensureNotNull(incompatibleParameterNames[interfaceName.text])

        val methodName = method.name
        ensure(isIdentifier(methodName))
        val methodReplacement = ensureNotNull(interfaceReplacement[methodName.text])

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        val parameterReplacement = ensureNotNull(methodReplacement[parameterName.text])

        ensure(parameterReplacement.signaturePredicate(method))

        parameterReplacement.name
    }
}
