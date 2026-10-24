package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isExpressionWithTypeArguments
import typescript.isHeritageClause
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertyAccessExpression

private val zlibTransforms = setOf(
    "BrotliCompress",
    "BrotliDecompress",
    "Deflate",
    "DeflateRaw",
    "Gunzip",
    "Gzip",
    "Inflate",
    "InflateRaw",
    "Unzip",
    "ZstdCompress",
    "ZstdDecompress",
)

val convertZlibTransform = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("zlib.d.ts"))

        ensure(isExpressionWithTypeArguments(node))

        val name = node.expression
        ensure(isPropertyAccessExpression(name))

        val propertyName = name.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text in "Transform")

        val heritageClause = ensureNotNull(node.parent)
        ensure(isHeritageClause(heritageClause))

        val interfaceNode = ensureNotNull(heritageClause.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text in zlibTransforms)

        // remove second transforms parent
        ""
    }
}
