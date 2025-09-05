package electron.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature
import typescript.isTypeReferenceNode

private val propertyNames = mapOf(
    "modifiers" to "modifier",
    "properties" to "property",
    "mediaTypes" to "mediaType",
    "protectedClasses" to "protectedClass",
    "types" to "type",
    "storages" to "storage",
    "quotas" to "quota",
    "dataTypes" to "dataType",
)

fun resolveInterfaceArrayFieldName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(
        typeName.text == "Array"
                || typeName.text == "ReadonlyArray"
    )

    val property = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    val mappedPropertyName = propertyNames[propertyName] ?: propertyName

    "${parentName.replaceFirstChar { it.titlecase() }}${mappedPropertyName.replaceFirstChar { it.titlecase() }}"
}
