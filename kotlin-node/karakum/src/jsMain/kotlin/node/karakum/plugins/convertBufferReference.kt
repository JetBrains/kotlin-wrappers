package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertBufferReference = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(
            typeName.text == "Buffer"
                    || typeName.text == "BufferEncoding"
        )

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))
        val declarations = symbol.declarations ?: emptyArray()

        ensure(declarations.any { declaration ->
            nullable {
                val sourceFileName = ensureNotNull(declaration.getSourceFileOrNull()).fileName
                sourceFileName.endsWith("buffer.d.ts")
            } != null
        })

        val typeArguments = if (typeName.text == "Buffer") {
            val typeArguments = node.typeArguments

            typeArguments?.asArray()
                ?.map { typeArgument -> render(typeArgument) }
                ?.filter { it.isNotEmpty() }
                ?.joinToString(separator = ", ")
                ?: "*"
        } else {
            ""
        }

        "node.buffer.${render(node.typeName)}${ifPresent(typeArguments) { "<${it}>" }}"
    }
}
