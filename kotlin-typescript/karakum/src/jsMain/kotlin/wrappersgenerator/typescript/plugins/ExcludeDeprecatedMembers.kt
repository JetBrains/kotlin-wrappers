package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.isDeprecated
import js.reflect.invoke
import typescript.isEnumMember

val ExcludeDeprecatedMembers = createPlugin { node, _, _ ->
    nullable {
        ensure(isDeprecated(node))

        val remove = isEnumMember(node)

        ensure(remove)

        ""
    }
}
