import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && (
            node.name.text === "mkdirSync"
            || node.name.text === "mkdtempSync"
            || node.name.text === "readdirSync"
            || node.name.text === "readlinkSync"
            || node.name.text === "realpathSync"
            || (
                node.name.text === "native"

                && node.parent
                && ts.isModuleBlock(node.parent)

                && node.parent.parent
                && ts.isModuleDeclaration(node.parent.parent)
                && ts.isIdentifier(node.parent.parent.name)
                && node.parent.parent.name.text === "realpathSync"
            )
        )
    ) {
        const name = (node.name && render(node.name)) ?? "Anonymous"

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: (parameters, signature) => {
                if (
                    name === "mkdirSync"

                    && signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "Mode"

                    && node.type
                    && ts.isUnionTypeNode(node.type)
                ) {
                    return ""
                }

                if (
                    (
                        name === "mkdtempSync"
                        || name === "readlinkSync"
                        || name === "realpathSync"
                        || name === "native"
                    )

                    && signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "EncodingOption"

                    && node.type
                    && ts.isUnionTypeNode(node.type)
                ) {
                    return ""
                }

                if (
                    name === "readdirSync"

                    && signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "BufferEncoding"

                    && node.type
                    && ts.isUnionTypeNode(node.type)
                ) {
                    return ""
                }

                return `external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
            }
        })
    }

    return null
}
