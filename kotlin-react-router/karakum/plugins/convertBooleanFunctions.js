import ts from "typescript";

export default function (node) {
    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && node.types[0].kind === ts.SyntaxKind.BooleanKeyword

        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && ts.isIdentifier(node.types[1].typeName)
        && node.types[1].typeName.text === "ActionFunction"

        && node.types[2]
        && node.types[2].kind === ts.SyntaxKind.UndefinedKeyword
    ) {
        return "ActionLike"
    }

    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && node.types[0].kind === ts.SyntaxKind.BooleanKeyword

        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && ts.isIdentifier(node.types[1].typeName)
        && node.types[1].typeName.text === "LoaderFunction"

        && node.types[2]
        && node.types[2].kind === ts.SyntaxKind.UndefinedKeyword
    ) {
        return "LoaderLike"
    }

    return null
}
