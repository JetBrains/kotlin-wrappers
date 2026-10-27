package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import js.reflect.invoke
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier

val convertArrayInheritance = createPlugin { node, _, render ->
    nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))

        ensure(
            expression.text == "Array"
                    || expression.text == "ReadonlyArray",
        )

        val typeArguments = node.typeArguments
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(", ")

        "js.array.JsArray${ifPresent(typeArguments) { "<$it>" }}"
    }
}
