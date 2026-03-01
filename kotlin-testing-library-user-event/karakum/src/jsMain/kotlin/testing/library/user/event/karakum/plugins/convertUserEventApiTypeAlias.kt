package testing.library.user.event.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertUserEventApiTypeAlias = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "UserEventApi")

        // unnecessary duplicated type
        ""
    }
}
