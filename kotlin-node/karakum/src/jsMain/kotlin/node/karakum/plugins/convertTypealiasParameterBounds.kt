package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

val convertTypealiasParameterBounds = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull())

        nullable {
            ensure(sourceFileName.fileName.endsWith("buffer.buffer.d.ts"))
            ensure(isTypeParameterDeclaration(node))
            val parent = node.getParentOrNull()
            ensureNotNull(parent)
            ensure(isTypeAliasDeclaration(parent))
            ensure(parent.name.text == "ImplicitArrayBuffer")

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType, { " : $it" })}${ifPresent(defaultType, { " default is $it" })}"

            "${name}${ifPresent(bound, { " /* ${it} */" })}"
        } ?: nullable {
            ensure(sourceFileName.fileName.endsWith("stream.d.ts"))
            ensure(isTypeParameterDeclaration(node))
            val parent = node.getParentOrNull()
            ensureNotNull(parent)
            ensure(isTypeAliasDeclaration(parent))
            ensure(
                parent.name.text == "PipelineCallback" ||
                        parent.name.text == "PipelineDestination" ||
                        parent.name.text == "PipelinePromise" ||
                        parent.name.text == "PipelineTransform"
            )

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType, { " : $it" })}${ifPresent(defaultType, { " default is $it" })}"

            "${name}${ifPresent(bound, { " /* ${it} */" })}"
        } ?: nullable {
            ensure(sourceFileName.fileName.endsWith("util.d.ts"))
            ensure(isTypeParameterDeclaration(node))
            val parent = node.getParentOrNull()
            ensureNotNull(parent)
            ensure(isTypeAliasDeclaration(parent))
            ensure(parent.name.text == "CustomPromisify")

            val name = render(node.name)

            val constraintType = node.constraint?.let { render(it) }
            val defaultType = node.default?.let { render(it) }

            val bound = "${ifPresent(constraintType, { " : $it" })}${ifPresent(defaultType, { " default is $it" })}"

            "${name}${ifPresent(bound, { " /* ${it} */" })}"
        }
    }
}
