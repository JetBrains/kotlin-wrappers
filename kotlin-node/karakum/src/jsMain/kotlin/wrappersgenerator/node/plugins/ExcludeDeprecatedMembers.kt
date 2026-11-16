package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.getJSDocDeprecatedTag
import typescript.ast.`is`.isClassDeclaration
import typescript.ast.`is`.isTypeAliasDeclaration

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        ensureNotNull(getJSDocDeprecatedTag(node))

        val save = (isTypeAliasDeclaration(node) && node.name.text == "NonSharedBuffer")
                || (isClassDeclaration(node) && node.name?.text == "Hmac")

        ensure(!save)

        ""
    }
}
