import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const typeReference = getParent(node)
    if (!typeReference) return null
    if (!ts.isTypeReferenceNode(typeReference)) return null
    if (!ts.isIdentifier(typeReference.typeName)) return null
    if (typeReference.typeName.text !== "TransformerFactory") return null

    const union = getParent(typeReference)
    if (!union) return null
    if (!ts.isUnionTypeNode(union)) return null

    let arrayType = getParent(union)
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
    if (propertyName !== "afterDeclarations") return null

    const interfaceNode = getParent(property)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text
    if (parentName !== "CustomTransformers") return null

    return `CustomTransformersAfterDeclarationsItemTypeArgument`
}
