package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.getJSDocDeprecatedTag
import typescript.isClassDeclaration
import typescript.isTypeAliasDeclaration

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        ensureNotNull(getJSDocDeprecatedTag(node))

        val save = (isTypeAliasDeclaration(node) && node.name.text == "NonSharedBuffer")
                || (isClassDeclaration(node) && node.name?.text == "Hmac")

        ensure(!save)

        ""
    }
}
