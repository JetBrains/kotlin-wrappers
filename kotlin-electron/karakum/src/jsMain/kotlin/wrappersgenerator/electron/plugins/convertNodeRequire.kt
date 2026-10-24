package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isInterfaceDeclaration

val convertNodeRequire = createPlugin { node, _, _ ->
    nullable {
        ensure(isInterfaceDeclaration(node))

        ensure(
            node.name.text == "NodeRequire"
                    || node.name.text == "NodeRequireFunction",
        )

        ""
    }
}
