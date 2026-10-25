package wrappersgenerator.typescript.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.Node
import typescript.asSequence
import typescript.isIdentifier
import typescript.isInterfaceDeclaration

suspend fun suppressJsArrayInheritors(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isInterfaceDeclaration(node))

        val inheritsJsArray = ensureNotNull(node.heritageClauses)
            .asSequence()
            .flatMap { it.types.asSequence() }
            .map { it.expression }
            .mapNotNull { if (isIdentifier(it)) it.escapedText else null }
            .any { it == "Array" || it == "ReadonlyArray" }

        ensure(inheritsJsArray)

        """
        @Suppress(
            "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
            "INTERFACE_WITH_SUPERCLASS",
            "FINAL_SUPERTYPE",
        )
        """.trimIndent()
    }
}
