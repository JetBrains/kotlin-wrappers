package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName

val convertElectronQualifiedName = createPlugin { node, _, render ->
    nullable {
        ensure(isQualifiedName(node))

        val left = node.left
        ensure(isIdentifier(left))
        ensure(left.text == "Electron")

        "electron.core.${render(node.right)}"
    } ?: nullable {
        ensure(isPropertyAccessExpression(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "Electron")

        "electron.core.${render(node.name)}"
    }
}
