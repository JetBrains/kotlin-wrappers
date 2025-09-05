package electron.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertUnknownRecordKeyType = createPlugin { node, _, _ ->
    nullable {
        ensure(
            node.kind == SyntaxKind.UnknownKeyword
                    || node.kind == SyntaxKind.AnyKeyword
        )

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        val typeName = typeReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Record")

        ensure(node === typeReference.typeArguments?.asArray()?.firstOrNull())

        "Any"
    }
}
