package wrappersgenerator.semver.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isQualifiedName
import typescript.ast.`is`.isTypeReferenceNode

val convertIdentifierBasePackage = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isQualifiedName(typeName))

        val left = typeName.left
        ensure(isIdentifier(left))
        ensure(left.text == "inc")

        ensure(typeName.right.text == "IdentifierBase")

        "IdentifierBase"
    }
}
