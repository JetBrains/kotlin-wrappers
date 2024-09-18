import ts from "typescript";

const versionParts = new Set(["major", "minor", "patch"])

export default function (node) {
    if (
        node.kind === ts.SyntaxKind.NumberKeyword

        && node.parent
        && ts.isPropertyDeclaration(node.parent)

        && node.parent.parent
        && ts.isClassDeclaration(node.parent.parent)

        && node.parent.parent.name?.text === "SemVer"

        && ts.isIdentifier(node.parent.name)
        && versionParts.has(node.parent.name.text)
    ) {
        return "Int"
    }

    if (
        node.kind === ts.SyntaxKind.NumberKeyword

        && node.parent
        && ts.isFunctionDeclaration(node.parent)
        && node.parent.type === node

        && ts.isIdentifier(node.parent.name)
        && versionParts.has(node.parent.name.text)
    ) {
        return "Int"
    }

    return null
}
