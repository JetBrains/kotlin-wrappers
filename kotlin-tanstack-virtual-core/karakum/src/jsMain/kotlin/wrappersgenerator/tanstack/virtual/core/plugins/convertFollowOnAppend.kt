package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.convertLiteralUnionType
import io.github.sgrishchenko.karakum.extension.plugins.isLiteralUnionType
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

// `FollowOnAppend = boolean | ScrollBehavior`
val convertFollowOnAppend = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        ensure(isTypeAliasDeclaration(node))

        val union = node.type
        ensure(isUnionTypeNode(union))
        ensure(union.types.asArray().any { it.kind == SyntaxKind.BooleanKeyword })

        val types = union.types.asArray().flatMap { type ->
            when {
                type.kind == SyntaxKind.BooleanKeyword -> ensureNotNull(booleanLiteralTypes())
                isTypeReferenceNode(type) -> ensureNotNull(referencedUnionTypes(type, typeChecker))
                else -> listOf(type)
            }
        }

        val literalUnion = factory.createUnionTypeNode(types.toTypedArray())
        ensure(isLiteralUnionType(literalUnion, context))

        val name = render(node.name)
        val result = convertLiteralUnionType(literalUnion, name, name, false, context, render)

        "${result.declaration}\n\n${result.generated}"
    }
}

// `false | true`
private fun booleanLiteralTypes(): List<TypeNode>? {
    val source = createSourceFile(
        "boolean.d.ts",
        "type T = false | true",
        ScriptTarget.Latest,
    )

    return aliasedUnionTypes(source.statements.asArray().singleOrNull())
}

private fun referencedUnionTypes(reference: TypeReferenceNode, typeChecker: TypeChecker): List<TypeNode>? =
    aliasedUnionTypes(typeChecker.getSymbolAtLocation(reference.typeName)?.declarations?.singleOrNull())

// `T = A | B`
private fun aliasedUnionTypes(declaration: Node?): List<TypeNode>? = nullable {
    val alias = ensureNotNull(declaration)
    ensure(isTypeAliasDeclaration(alias))

    val union = alias.type
    ensure(isUnionTypeNode(union))

    union.types.asArray().toList()
}
