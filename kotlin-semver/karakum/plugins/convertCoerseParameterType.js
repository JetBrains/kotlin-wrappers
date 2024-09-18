import ts from "typescript";

export default function (node) {
    if (
        node.kind === ts.SyntaxKind.NumberKeyword

        && node.parent
        && ts.isUnionTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "version"

        && node.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "coerce"
    ) {
        return "Number"
    }

    return null
}
