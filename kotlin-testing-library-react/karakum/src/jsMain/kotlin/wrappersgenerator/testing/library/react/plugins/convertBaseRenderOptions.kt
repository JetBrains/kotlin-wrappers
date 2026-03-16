package wrappersgenerator.testing.library.react.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier

val convertBaseRenderOptions = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "BaseRenderOptions")

        "RenderOptions"
    }
}
