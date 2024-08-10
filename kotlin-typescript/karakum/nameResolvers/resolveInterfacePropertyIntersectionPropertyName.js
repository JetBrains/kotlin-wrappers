import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const subProperty = getParent(node)
    if (!subProperty) return null
    if (!ts.isPropertySignature(subProperty)) return null
    if (!ts.isIdentifier(subProperty.name)) return null

    const subPropertyName = subProperty.name.text

    const typeLiteral = getParent(subProperty)
    if (!typeLiteral) return null
    if (!ts.isTypeLiteralNode(typeLiteral)) return null

    const intersection = getParent(typeLiteral)
    if (!intersection) return null
    if (!ts.isIntersectionTypeNode(intersection)) return null

    const property = getParent(intersection)
    if (!property) return null
    if (!ts.isPropertySignature(property)) return null
    if (!ts.isIdentifier(property.name)) return null

    const propertyName = property.name.text

    const interfaceNode = getParent(property)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyName)}${karakum.capitalize(subPropertyName)}`
}
