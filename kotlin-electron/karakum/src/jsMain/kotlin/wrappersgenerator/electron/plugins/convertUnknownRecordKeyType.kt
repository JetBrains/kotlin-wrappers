package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.SyntaxKind
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode

val convertUnknownRecordKeyType = createPlugin { node, _, _ ->
    nullable {
        ensure(
            node.kind == SyntaxKind.UnknownKeyword
                    || node.kind == SyntaxKind.AnyKeyword,
        )

        val typeReference = ensureNotNull(node.parent)
        ensure(isTypeReferenceNode(typeReference))

        val typeName = typeReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Record")

        ensure(node === typeReference.typeArguments?.firstOrNull())

        "Any"
    }
}
