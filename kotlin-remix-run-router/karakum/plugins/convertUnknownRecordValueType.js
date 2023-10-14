import ts from "typescript";

export default function (node) {
    if (
        (
            node.kind === ts.SyntaxKind.UnknownKeyword
            || node.kind === ts.SyntaxKind.AnyKeyword
        )

        && node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Record"
    ) {

        return "Any"
    }
    return null
}
