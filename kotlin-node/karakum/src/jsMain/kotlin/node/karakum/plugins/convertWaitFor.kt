package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.*

private fun isWaitForMethod(node: Node) = nullable {
    ensure(isMethodSignature(node))

    val name = node.name
    ensure(isIdentifier(name))
    ensure(name.text == "waitFor")
} != null

val convertWaitFor = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Awaited")

        val promiseType = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(promiseType))

        val promiseTypeName = promiseType.typeName
        ensure(isIdentifier(promiseTypeName))
        ensure(promiseTypeName.text == "Promise")

        val method = ensureNotNull(promiseType.getParentOrNull())
        ensure(isWaitForMethod(method))

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())

        render(typeArguments.first())
    } ?: nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "T")

        val functionType = ensureNotNull(node.getParentOrNull())
        ensure(isFunctionTypeNode(functionType))

        val parameter = ensureNotNull(functionType.getParentOrNull())
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isWaitForMethod(method))

        "Promise<${render(node)}>"
    }
}
