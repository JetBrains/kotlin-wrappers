package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertUtilTypeHelpers = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull())
        ensure(sourceFileName.fileName.endsWith("util.d.ts"))
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "IfDefaultsTrue" || typeName.text == "IfDefaultsFalse")

        ""
    }
}
