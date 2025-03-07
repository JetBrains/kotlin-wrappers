import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("fs.d.ts") && !sourceFileName.endsWith("fs/promises.d.ts")) return null

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

    let postfix = ""
    if (
        parameterName === "options"
        && sourceFileName.endsWith("fs/promises.d.ts")
    ) {
        postfix = "Async"
    }

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

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "ObjectEncodingOptions"
        ) {
            if (
                node.types[1]
                && ts.isTypeLiteralNode(node.types[1])
                && node.types[1].members.some(member => (
                    ts.isPropertySignature(member)
                    && ts.isIdentifier(member.name)
                    && member.name.text === "withFileTypes"
                    && ts.isLiteralTypeNode(member.type)
                    && member.type.literal.kind === ts.SyntaxKind.TrueKeyword
                ))
            ) {
                infix = "WithFileTypes"
            } else {
                infix = ""
            }
        }

        return `${karakum.capitalize(parentName)}${infix}${postfix}${karakum.capitalize(parameterName)}`
    }

    if (
        parentName === "readFile"
        || parentName === "readFileSync"
        || parentName === "FileHandleReadFile"
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

        return `${karakum.capitalize(parentName)}${infix}${postfix}${karakum.capitalize(parameterName)}`
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
        || parentName === "FileHandleStat"
    ) {
        let infix = parentName === "stat" || parentName === "watchFile" ? "Simple" : ""

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

        return `${karakum.capitalize(parentName)}${infix}${postfix}${karakum.capitalize(parameterName)}`
    }

    if (
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

        return `${karakum.capitalize(parentName)}${infix}${postfix}${karakum.capitalize(parameterName)}`
    }

    if (parentName === "StatSyncFn") {
        let primaryInfix = "Simple"
        let secondaryInfix = "ThrowIfNoEntry"

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
            primaryInfix = "BigInt"
        }

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeLiteralNode(node.types[1])
            && node.types[1].members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "throwIfNoEntry"
                && ts.isLiteralTypeNode(member.type)
                && member.type.literal.kind === ts.SyntaxKind.FalseKeyword
            ))
        ) {
            secondaryInfix = ""
        }

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeLiteralNode(node.types[1])
            && node.types[1].members.some(member => (
                ts.isPropertySignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "throwIfNoEntry"
                && ts.isUnionTypeNode(member.type)
                && member.type.types[0]
                && ts.isLiteralTypeNode(member.type.types[0])
                && member.type.types[0].literal.kind === ts.SyntaxKind.FalseKeyword
            ))
        ) {
            // it is not `throwIfNoEntry` options and they are not simple
            primaryInfix = ""
            secondaryInfix = ""
        }

        return `${karakum.capitalize(parentName)}${primaryInfix}${secondaryInfix}${postfix}${karakum.capitalize(parameterName)}`
    }

    return `${karakum.capitalize(parentName)}${postfix}${karakum.capitalize(parameterName)}`
}
