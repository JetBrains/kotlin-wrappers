package typescript.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isPropertySignature

fun annotateVarOverrides(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(
            name.text == "kind"
                    || name.text == "type"
        )

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "AssertsIdentifierTypePredicate"
                    || interfaceNode.name.text == "AssertsThisTypePredicate"
                    || interfaceNode.name.text == "IdentifierTypePredicate"
                    || interfaceNode.name.text == "ThisTypePredicate"
        )

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "value")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "BigIntLiteralType"
                    || interfaceNode.name.text == "StringLiteralType"
                    || interfaceNode.name.text == "NumberLiteralType"
        )

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "moduleSpecifier")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "CompletionEntryDataResolved")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "exportMapKey")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "CompletionEntryDataUnresolved")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(
            name.text == "file"
                    || name.text == "start"
                    || name.text == "length"
        )

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "DiagnosticWithLocation")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "useCaseSensitiveFileNames")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "ParseConfigHost")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "target")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "TupleTypeReference")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "useCaseSensitiveFileNames")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "LanguageServiceHost")

        "@Suppress(\"PROPERTY_TYPE_MISMATCH_ON_OVERRIDE\", \"VAR_OVERRIDDEN_BY_VAL\")"
    }
}
