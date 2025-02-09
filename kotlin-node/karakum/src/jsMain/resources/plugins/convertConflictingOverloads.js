import ts from "typescript";
import * as karakum from "../karakum.mjs";

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
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    return node.name && (
        (
            (
                sourceFileName.endsWith("fs.d.ts")
                || sourceFileName.endsWith("fs/promises.d.ts")
            )
            && (
                node.name.text === "mkdirSync"
                || node.name.text === "mkdtempSync"
                || node.name.text === "readdirSync"
                || node.name.text === "readlinkSync"
                || node.name.text === "realpathSync"
                || node.name.text === "watch"
                || isNativeRealpathSync(node)
            )
        )
        || (
            sourceFileName.endsWith("stream.d.ts")
            && (
                (
                    node.name.text === "pipeline"

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isQualifiedName(node.type.typeName)
                )
            )
        )
        || (
            sourceFileName.endsWith("url.d.ts")
            && (
                (
                    node.name.text === "parse"

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isIdentifier(node.type.typeName)
                    && (
                        node.type.typeName.text === "UrlWithStringQuery"
                        || node.type.typeName.text === "UrlWithParsedQuery"
                    )
                )
            )
        )
        || (
            sourceFileName.endsWith("crypto.d.ts")
            && (
                (
                    node.name.text === "hash"

                    && node.type
                    && ts.isUnionTypeNode(node.type)
                )
            )
        )
    )
}

function isConflictingOverload(node, signature) {
    return (
        (
            node.name.text === "mkdirSync"

            && (
                signature.length === 1
                || (
                    signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "Mode"
                )
            )

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

            && (
                signature.length === 1
                || (
                    signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "BufferEncoding"
                )
            )

            && node.type
            && ts.isUnionTypeNode(node.type)
        )
        || (
            node.name.text === "watch"

            && (
                (
                    signature.length === 1

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isIdentifier(node.type.typeName)
                    && node.type.typeName.text === "FSWatcher"
                )
                || (
                    signature[1]
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
        )
        || (
            node.name.text === "pipeline"

            && signature[2]
            && signature[2].parameter.dotDotDotToken

            && node.type
            && ts.isTypeReferenceNode(node.type)
            && ts.isQualifiedName(node.type.typeName)
        )
        || (
            node.name.text === "parse"

            && signature[1]
            && (
                (
                    ts.isLiteralTypeNode(signature[1].type)
                    && signature[1].type.literal.kind === ts.SyntaxKind.TrueKeyword

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isIdentifier(node.type.typeName)
                    && node.type.typeName.text === "UrlWithParsedQuery"
                )
                || (
                    ts.isLiteralTypeNode(signature[1].type)
                    && signature[1].type.literal.kind === ts.SyntaxKind.FalseKeyword

                    && node.type
                    && ts.isTypeReferenceNode(node.type)
                    && ts.isIdentifier(node.type.typeName)
                    && node.type.typeName.text === "UrlWithStringQuery"
                )
            )
        )
        || (
            node.name.text === "hash"

            && signature[2]
            && (
                (
                    ts.isTypeReferenceNode(signature[2].type)
                    && ts.isIdentifier(signature[2].type.typeName)
                    && signature[2].type.typeName.text === "BinaryToTextEncoding"
                )
                || (
                    ts.isLiteralTypeNode(signature[2].type)
                    && ts.isStringLiteral(signature[2].type.literal)
                    && signature[2].type.literal.text === "buffer"
                )
            )

            && node.type
            && ts.isUnionTypeNode(node.type)
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
