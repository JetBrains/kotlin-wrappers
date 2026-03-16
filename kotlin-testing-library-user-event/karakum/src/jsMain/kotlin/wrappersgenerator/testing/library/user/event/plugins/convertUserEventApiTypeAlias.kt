package wrappersgenerator.testing.library.user.event.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isTypeAliasDeclaration

val convertUserEventApiTypeAlias = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "UserEventApi")

        // unnecessary duplicated type
        ""
    }
}
