import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("v8.d.ts")) return null

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

    let parentName

    const signatureDeclaration = getParent(parameter)
    if (!signatureDeclaration) return null

    if (ts.isFunctionDeclaration(signatureDeclaration)) {
        if (signatureDeclaration.name === undefined) return null

        parentName = signatureDeclaration.name.text
    } else if (ts.isCallSignatureDeclaration(signatureDeclaration)) {
        const interfaceNode = getParent(signatureDeclaration)
        if (!interfaceNode) return null
        if (!ts.isInterfaceDeclaration(interfaceNode)) return null

        parentName = interfaceNode.name.text
    } else if (ts.isMethodSignature(signatureDeclaration)) {
        if (signatureDeclaration.name === undefined) return null

        const interfaceNode = getParent(signatureDeclaration)
        if (!interfaceNode) return null
        if (!ts.isInterfaceDeclaration(interfaceNode)) return null

        parentName = `${karakum.capitalize(interfaceNode.name.text)}${karakum.capitalize(signatureDeclaration.name.text)}`
    } else {
        return null
    }

    if (
        parentName === "queryObjects"
    ) {
        let infix = ""

        if (
            ts.isTypeLiteralNode(node)
            && node.members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "format"
                && ts.isLiteralTypeNode(member.type)
                && ts.isStringLiteral(member.type.literal)
                && member.type.literal.text === "count"
            ))
        ) {
            infix = "Count"
        }

        if (
            ts.isTypeLiteralNode(node)
            && node.members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "format"
                && ts.isLiteralTypeNode(member.type)
                && ts.isStringLiteral(member.type.literal)
                && member.type.literal.text === "summary"
            ))
        ) {
            infix = "Summary"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
