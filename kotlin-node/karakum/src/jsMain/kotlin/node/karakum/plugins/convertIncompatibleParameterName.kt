package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.MethodDeclaration
import typescript.MethodSignature
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isParameter

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
            "data" to ParameterNameReplacement("str", declarationPredicate = { it.parameters.asArray().size == 3 }),
        )
    ),
)

val convertIncompatibleParameterName = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))
        ensure(parameter.name === node)

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodDeclaration(method))

        val classNode = ensureNotNull(method.getParentOrNull())
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

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))
        ensure(parameter.name === node)

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val interfaceNode = ensureNotNull(method.getParentOrNull())
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
