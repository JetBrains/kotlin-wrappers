import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isIndexedAccessTypeNode(node)

        && ts.isTypeReferenceNode(node.objectType)
        && ts.isIdentifier(node.objectType.typeName)
        && node.objectType.typeName.text === "JSDocAugmentsTag"

        && ts.isLiteralTypeNode(node.indexType)
        && ts.isStringLiteral(node.indexType.literal)
        && node.indexType.literal.text === "class"
    ) {
        return `JSDocAugmentsTagClass`
    }

    if (
        ts.isIndexedAccessTypeNode(node)

        && ts.isTypeReferenceNode(node.objectType)
        && ts.isIdentifier(node.objectType.typeName)
        && node.objectType.typeName.text === "JSDocImplementsTag"

        && ts.isLiteralTypeNode(node.indexType)
        && ts.isStringLiteral(node.indexType.literal)
        && node.indexType.literal.text === "class"
    ) {
        return `JSDocImplementsTagClass`
    }

    return null
}
