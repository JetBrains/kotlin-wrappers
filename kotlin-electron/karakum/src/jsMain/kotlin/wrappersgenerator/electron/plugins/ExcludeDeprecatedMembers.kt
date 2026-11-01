package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.isDeprecated

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        ensure(isDeprecated(node))

        ""
    }
}
