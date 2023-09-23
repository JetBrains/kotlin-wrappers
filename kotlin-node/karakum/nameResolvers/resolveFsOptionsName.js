import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    const union = getParent(node)
    if (!union) return null
    if (!ts.isUnionTypeNode(union)) return null

    const parameter = getParent(union)
    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text

    const functionNode = getParent(parameter)
    if (!functionNode) return null
    if (!ts.isFunctionDeclaration(functionNode)) return null
    if (functionNode.name === undefined) return null

    const parentName = functionNode.name.text

    if (
        parentName === "readdir"
        || parentName === "readdirSync"
    ) {
        let infix = "String"

        if (
            ts.isTypeLiteralNode(node)
            && node.members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "encoding"
                && ts.isLiteralTypeNode(member.type)
                && ts.isStringLiteral(member.type.literal)
                && member.type.literal.text === "buffer"
            ))
        ) {
            infix = "Buffer"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    if (parentName === "readFileSync") {
        let infix = "Buffer"

        if (
            ts.isTypeLiteralNode(node)
            && node.members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "encoding"
                && ts.isTypeReferenceNode(member.type)
                && ts.isIdentifier(member.type.typeName)
                && member.type.typeName.text === "BufferEncoding"
            ))
        ) {
            infix = "String"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
