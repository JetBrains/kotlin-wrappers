package testing.library.user.event.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertSetupDirect = createPlugin { node, _, render ->
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "setupDirect")

        // produces unnecessary anonymous type
        ""
    }
}
