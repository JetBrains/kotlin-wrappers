package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.SyntaxKind
import typescript.isTypeParameterDeclaration

// TODO: provide common solution?
val convertTypeParameterWithStringBound = createPlugin { node, context, render ->
    nullable {
        ensure(node.kind == SyntaxKind.StringKeyword)
        val parent = node.parent
        ensure(isTypeParameterDeclaration(parent))
        ensure(parent.constraint == node)

        "Any /* String */"
    }
}
