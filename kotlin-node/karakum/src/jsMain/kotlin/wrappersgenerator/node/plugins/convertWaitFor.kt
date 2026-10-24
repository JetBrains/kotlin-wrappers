package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

private fun isWaitForMethod(node: Node) = nullable {
    ensure(isMethodSignature(node))

    val name = node.name
    ensure(isIdentifier(name))
    ensure(name.text == "waitFor")
} != null

val convertWaitFor = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Awaited")

        val promiseType = ensureNotNull(node.parent)
        ensure(isTypeReferenceNode(promiseType))

        val promiseTypeName = promiseType.typeName
        ensure(isIdentifier(promiseTypeName))
        ensure(promiseTypeName.text == "Promise")

        val method = ensureNotNull(promiseType.parent)
        ensure(isWaitForMethod(method))

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?: nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "T")

        val functionType = ensureNotNull(node.parent)
        ensure(isFunctionTypeNode(functionType))

        val parameter = ensureNotNull(functionType.parent)
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.parent)
        ensure(isWaitForMethod(method))

        "js.promise.Promise<${render(node)}>"
    }
}
