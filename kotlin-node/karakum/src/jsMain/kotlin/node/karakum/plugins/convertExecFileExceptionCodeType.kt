package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration
import typescript.isUnionTypeNode

val convertExecFileExceptionCodeType = createPlugin { node, context, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val propertySignature = ensureNotNull(node.getParentOrNull())
        ensure(isPropertySignature(propertySignature))

        val propertyName = propertySignature.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "code")

        val typeAlias = propertySignature
            .getParentOrNull() // TypeLiteral
            ?.getParentOrNull() // IntersectionType
            ?.getParentOrNull() // TypeAliasDeclaration
            .let { ensureNotNull(it) }
        ensure(isTypeAliasDeclaration(typeAlias))

        val typeAliasName = typeAlias.name
        ensure(isIdentifier(typeAliasName))
        ensure(typeAliasName.text == "ExecFileException")

        "dynamic"
    }
}
