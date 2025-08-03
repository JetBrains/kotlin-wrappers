package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

val convertTypealiasParameterBounds = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

        nullable {
            ensure(sourceFileName.endsWith("buffer.buffer.d.ts"))
            ensure(isTypeParameterDeclaration(node))

            val typeAlias = ensureNotNull(node.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ImplicitArrayBuffer")

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

            "${name}${ifPresent(bound) { " /* $it */" }}"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(isTypeParameterDeclaration(node))

            val typeAlias = ensureNotNull(node.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(
                typeAlias.name.text == "PipelineCallback" ||
                        typeAlias.name.text == "PipelineDestination" ||
                        typeAlias.name.text == "PipelinePromise" ||
                        typeAlias.name.text == "PipelineTransform"
            )

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

            "${name}${ifPresent(bound) { " /* $it */" }}"
        } ?: nullable {
            ensure(sourceFileName.endsWith("util.d.ts"))

            ensure(isTypeParameterDeclaration(node))

            val typeAlias = ensureNotNull(node.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "CustomPromisify")

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

            "${name}${ifPresent(bound) { " /* $it */" }}"
        }
    }
}
