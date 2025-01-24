import ts from "typescript";

function isSubmissionJson(node) {
    return (
        ts.isIndexedAccessTypeNode(node)

        && ts.isTypeReferenceNode(node.objectType)
        && ts.isIdentifier(node.objectType.typeName)
        && node.objectType.typeName.text === "Submission"

        && ts.isLiteralTypeNode(node.indexType)
        && ts.isStringLiteral(node.indexType.literal)
        && node.indexType.literal.text === "json"
    )
}

export default function (node) {
    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && isSubmissionJson(node.types[0])

        && node.types[1]
        && node.types[1].kind === ts.SyntaxKind.UndefinedKeyword
    ) {
        // remove additional nullability
        // because JsonValue already includes null
        return "JsonValue"
    }

    if (isSubmissionJson(node)) {
        // remove additional nullability
        // because JsonValue already includes null
        return "JsonValue"
    }

    return null
}
