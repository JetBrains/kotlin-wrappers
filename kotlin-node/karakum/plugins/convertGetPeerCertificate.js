import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isMethodDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "getPeerCertificate"

        && node.parent
        && ts.isClassDeclaration(node.parent)
        && node.parent.name
        && node.parent.name.text === "TLSSocket"

        && node.parameters.length === 1
        && node.parameters[0]
        && node.parameters[0].type
        && ts.isLiteralTypeNode(node.parameters[0].type)
        && (
            node.parameters[0].type.literal.kind === ts.SyntaxKind.TrueKeyword
            || node.parameters[0].type.literal.kind === ts.SyntaxKind.FalseKeyword
        )
    ) {
        return ""
    }

    return null
}
