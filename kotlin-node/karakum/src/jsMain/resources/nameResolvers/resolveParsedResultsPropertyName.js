import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const property = getParent(node)
    if (!property) return null
    if (!ts.isPropertySignature(property)) return null
    if (!ts.isIdentifier(property.name)) return null

    const propertyName = property.name.text

    const typeLiteral = getParent(property)
    if (!typeLiteral) return null
    if (!ts.isTypeLiteralNode(typeLiteral)) return null

    const conditionalType = getParent(typeLiteral)
    if (!conditionalType) return null
    if (!ts.isConditionalTypeNode(conditionalType)) return null

    const typeAlias = getParent(conditionalType)
    if (!typeAlias) return null
    if (!ts.isTypeAliasDeclaration(typeAlias)) return null

    const parentName = typeAlias.name.text
    if (parentName !== "ParsedResults") return null

    return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyName)}`
}
