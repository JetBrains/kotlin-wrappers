import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isStringLiteral(node)

        && node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isTypeReferenceNode(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.typeName)
        && node.parent.parent.typeName.text === "KeyExportOptions"
    ) {
        return `KeyFormat.${node.text}`
    }


    return null
}
