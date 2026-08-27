package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isTypeAliasDeclaration
import typescript.isTypeReferenceNode

// `ScrollToEndOptions = Pick<ScrollToOptions, 'behavior'>`
val convertPick = createPlugin { node, context, render ->
    nullable {
        val typeChecker = context.requireService(typeScriptServiceKey).program.getTypeChecker()

        ensure(isTypeAliasDeclaration(node))

        val type = node.type
        ensure(isTypeReferenceNode(type))

        val typeName = type.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Pick")

        val members = typeChecker.getPropertiesOfType(typeChecker.getTypeFromTypeNode(type))
            .map { render(ensureNotNull(it.declarations?.singleOrNull())) }
            .joinToString("\n")

        // language=kotlin
        """
        @kotlinx.js.JsPlainObject
        external interface ${render(node.name)} {
        $members
        }
        """.trimIndent()
    }
}
