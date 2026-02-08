package `null`.writable.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isParameter

val convertParameterNames = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(isParameter(node.parent))

        ensure(
            node.text == "_chunk"
                    || node.text == "_encoding"
                    || node.text == "_chunks"
        )

        node.text.removePrefix("_")
    }
}
