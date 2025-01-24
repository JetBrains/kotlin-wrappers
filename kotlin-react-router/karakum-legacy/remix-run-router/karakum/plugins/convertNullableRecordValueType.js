import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isUnionTypeNode(node)
        && node.types.length > 1
        && node.types[1].kind === ts.SyntaxKind.UndefinedKeyword

        && node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Record"
    ) {
        return `${render(node.types[0])}`
    }
    return null
}
