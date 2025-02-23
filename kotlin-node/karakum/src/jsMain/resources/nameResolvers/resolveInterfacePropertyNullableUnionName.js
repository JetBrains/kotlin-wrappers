import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const union = getParent(node)
    if (!union) return null
    if (!ts.isUnionTypeNode(union)) return null
    if (union.types.length < 2) return null
    if (union.types[1].kind !== ts.SyntaxKind.UndefinedKeyword) return null

    const property = getParent(union)
    if (!property) return null
    if (!ts.isPropertySignature(property)) return null
    if (!ts.isIdentifier(property.name)) return null

    const propertyName = property.name.text

    const interfaceNode = getParent(property)
    if (!interfaceNode) return null
    if (!ts.isInterfaceDeclaration(interfaceNode)) return null

    const parentName = interfaceNode.name.text

    return `${karakum.capitalize(parentName)}${karakum.capitalize(propertyName)}`
}
