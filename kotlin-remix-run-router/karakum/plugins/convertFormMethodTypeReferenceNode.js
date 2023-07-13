import ts from "typescript";

export default function (node) {
    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && ts.isTypeReferenceNode(node.types[0])
        && ts.isIdentifier(node.types[0].typeName)
        && node.types[0].typeName.text === "FormMethod"

        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && ts.isIdentifier(node.types[1].typeName)
        && node.types[1].typeName.text === "V7_FormMethod"
    ) {
        if (
            node.types[2]
            && node.types[2].kind === ts.SyntaxKind.UndefinedKeyword
        ) {
            return "FormMethod?"
        }

        return "FormMethod"
    }

    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && ts.isTypeReferenceNode(node.types[0])
        && ts.isIdentifier(node.types[0].typeName)
        && node.types[0].typeName.text === "LowerCaseFormMethod"

        && node.types[1]
        && ts.isTypeReferenceNode(node.types[1])
        && ts.isIdentifier(node.types[1].typeName)
        && node.types[1].typeName.text === "UpperCaseFormMethod"
    ) {
        if (
            node.types[2]
            && node.types[2].kind === ts.SyntaxKind.UndefinedKeyword
        ) {
            return "FormMethod?"
        }

        return "FormMethod"
    }

    if (
        ts.isIndexedAccessTypeNode(node)
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "formMethod"
    ) {
        return "FormMethod"
    }

    return null
}
