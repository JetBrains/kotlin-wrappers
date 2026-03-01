package testing.library.user.event.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isModuleDeclaration
import typescript.isVariableDeclaration

val convertGlobalPatches = createPlugin { node, _, _ ->
    nullable {
        ensure(isModuleDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "global")

        ""
    } ?: nullable {
        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text in setOf(
            "patched",
            "isPrepared",
            "TrackChanges",
            "UIValue",
            "UISelection",
            "InitialValue",
            "fakeFiles",
            "PointerEventsCheck",
        ))

        ""
    }
}
