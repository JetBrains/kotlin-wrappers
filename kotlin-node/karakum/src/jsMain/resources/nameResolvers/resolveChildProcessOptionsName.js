import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("child_process.d.ts")) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
    const getParent = typeScriptService?.getParent.bind(typeScriptService) ?? (node => node.parent)

    let parameter = getParent(node)
    if (ts.isParenthesizedTypeNode(parameter)) {
        parameter = getParent(parameter)
    }
    if (ts.isUnionTypeNode(parameter)) {
        parameter = getParent(parameter)
    }

    if (!parameter) return null
    if (!ts.isParameter(parameter)) return null
    if (!ts.isIdentifier(parameter.name)) return null

    const parameterName = parameter.name.text

    const signatureDeclaration = getParent(parameter)
    if (!signatureDeclaration) return null
    if (!ts.isFunctionDeclaration(signatureDeclaration)) return null
    if (signatureDeclaration.name === undefined) return null

    const parentName = signatureDeclaration.name.text

    if (
        parentName === "exec"
    ) {
        let infix = "String"

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeLiteralNode(node.types[0])
            && node.types[0].members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "encoding"
                && ts.isUnionTypeNode(member.type)
                && member.type.types[0]
                && ts.isLiteralTypeNode(member.type.types[0])
                && ts.isStringLiteral(member.type.types[0].literal)
                && member.type.types[0].literal.text === "buffer"
            ))
        ) {
            infix = "Buffer"
        }

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "ObjectEncodingOptions"
        ) {
            infix = "ObjectEncoding"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    if (
        parentName === "execFile"
    ) {
        let infix = ""

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "ObjectEncodingOptions"
        ) {
            infix = "ObjectEncoding"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
