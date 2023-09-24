import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("fs.d.ts")) return null

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
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

    const functionNode = getParent(parameter)
    if (!functionNode) return null
    if (!ts.isFunctionDeclaration(functionNode)) return null
    if (functionNode.name === undefined) return null

    const parentName = functionNode.name.text

    if (
        parentName === "readdir"
        || parentName === "readdirSync"
        || parentName === "watch"
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

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeLiteralNode(node.types[1])
            && node.types[1].members.some(member => (
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

    if (
        parentName === "readFile"
        || parentName === "readFileSync"
    ) {
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

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeLiteralNode(node.types[0])
            && node.types[0].members.some(member => (
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

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "ObjectEncodingOptions"
        ) {
            infix = ""
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    if (
        parentName === "stat"
        || parentName === "statSync"
        || parentName === "statfs"
        || parentName === "statfsSync"
        || parentName === "fstat"
        || parentName === "fstatSync"
        || parentName === "lstat"
        || parentName === "watchFile"
    ) {
        let infix = parentName === "stat" ? "Simple" : ""

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeLiteralNode(node.types[1])
            && node.types[1].members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "bigint"
                && ts.isLiteralTypeNode(member.type)
                && member.type.literal.kind === ts.SyntaxKind.TrueKeyword
            ))
        ) {
            infix = "BigInt"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }if (
        parentName === "mkdir"
        || parentName === "mkdirSync"
    ) {
        let infix = ""

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeLiteralNode(node.types[1])
            && node.types[1].members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "recursive"
                && ts.isLiteralTypeNode(member.type)
                && member.type.literal.kind === ts.SyntaxKind.TrueKeyword
            ))
        ) {
            infix = "Recursive"
        }

        return `${karakum.capitalize(parentName)}${infix}${karakum.capitalize(parameterName)}`
    }

    return `${karakum.capitalize(parentName)}${karakum.capitalize(parameterName)}`
}
