import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("os.d.ts")) return null

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
        parentName === "userInfo"
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

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
