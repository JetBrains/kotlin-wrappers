import ts from "typescript";
import * as karakum from "karakum";

function isNativeRealpathSync(node) {
    return (
        node.name
        && node.name.text === "native"

        && node.parent
        && ts.isModuleBlock(node.parent)

        && node.parent.parent
        && ts.isModuleDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "realpathSync"
    )
}

function hasConflictingOverloads(node) {
    return node.name && (
        node.name.text === "mkdirSync"
        || node.name.text === "mkdtempSync"
        || node.name.text === "readdirSync"
        || node.name.text === "readlinkSync"
        || node.name.text === "realpathSync"
        || node.name.text === "watch"
        || isNativeRealpathSync(node)
    )
}

function isConflictingOverload(node, signature) {
    return (
        (
            node.name.text === "mkdirSync"

            && signature[1]
            && ts.isTypeReferenceNode(signature[1].type)
            && ts.isIdentifier(signature[1].type.typeName)
            && signature[1].type.typeName.text === "Mode"

            && node.type
            && ts.isUnionTypeNode(node.type)
        )
        || (
            (
                node.name.text === "mkdtempSync"
                || node.name.text === "readlinkSync"
                || node.name.text === "realpathSync"
                || isNativeRealpathSync(node)
            )

            && signature[1]
            && ts.isTypeReferenceNode(signature[1].type)
            && ts.isIdentifier(signature[1].type.typeName)
            && signature[1].type.typeName.text === "EncodingOption"

            && node.type
            && ts.isUnionTypeNode(node.type)
        )
        || (
            node.name.text === "readdirSync"

            && signature[1]
            && ts.isTypeReferenceNode(signature[1].type)
            && ts.isIdentifier(signature[1].type.typeName)
            && signature[1].type.typeName.text === "BufferEncoding"

            && node.type
            && ts.isUnionTypeNode(node.type)
        )
        || (
            node.name.text === "watch"

            && signature[1]
            && (
                (
                    ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "WatchOptions"

                    && node.type
                    && ts.isUnionTypeNode(node.type)
                )
                || (
                    ts.isLiteralTypeNode(signature[1].type)
                    && ts.isStringLiteral(signature[1].type.literal)
                    && signature[1].type.literal.text === "buffer"

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isIdentifier(node.type.typeName)
                    && node.type.typeName.text === "AsyncIterable"
                )
            )
        )
    )
}

export default function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && hasConflictingOverloads(node)
    ) {
        const name = (node.name && render(node.name)) ?? "Anonymous"

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: (parameters, signature) => {
                if (isConflictingOverload(node, signature)) {
                    return ""
                }

                return `external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
            }
        })
    }

    return null
}
