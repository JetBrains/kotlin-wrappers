import ts from "typescript";
import * as karakum from "karakum";

const resolveTypeReference = (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const typeReference = getParent(node)
    if (!typeReference) return null
    if (!ts.isTypeReferenceNode(typeReference)) return null
    if (!ts.isIdentifier(typeReference.typeName)) return null
    if (
        typeReference.typeName.text !== "Array"
        && typeReference.typeName.text !== "NodeArray"
    ) return null

    const property = getParent(typeReference)
    if (!property) return null
    if (!ts.isPropertySignature(property)) return null
    if (!ts.isIdentifier(property.name)) return null

    const propertyName = property.name.text

    const interfaceNode = getParent(property)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyName)}Item`
}

const resolveArrayType = (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    let arrayType = getParent(node)
    if (ts.isParenthesizedTypeNode(arrayType)) {
        arrayType = getParent(arrayType)
    }
    if (!arrayType) return null
    if (!ts.isArrayTypeNode(arrayType)) return null

    let property = getParent(arrayType)
    if (ts.isTypeOperatorNode(property)) {
        property = getParent(property)
    }
    if (!property) return null
    if (!ts.isPropertySignature(property)) return null
    if (!ts.isIdentifier(property.name)) return null

    const propertyName = property.name.text

    const interfaceNode = getParent(property)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyName)}Item`
}

export default [
    resolveTypeReference,
    resolveArrayType,
]
