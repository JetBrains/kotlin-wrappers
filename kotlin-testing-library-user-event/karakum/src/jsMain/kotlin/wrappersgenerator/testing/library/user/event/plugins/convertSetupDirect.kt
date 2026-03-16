package wrappersgenerator.testing.library.user.event.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isFunctionDeclaration

val convertSetupDirect = createPlugin { node, _, render ->
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "setupDirect")

        // produces unnecessary anonymous type
        ""
    }
}
