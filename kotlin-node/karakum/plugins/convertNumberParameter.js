import ts from "typescript";

export default function (node) {
    if (
        node.kind === ts.SyntaxKind.NumberKeyword
        && node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionTypeNode(node.parent.parent)
        && node.parent.parent.parent
        && ts.isParameter(node.parent.parent.parent)
    ) {
        return "Double"
    }

    if (
        node.kind === ts.SyntaxKind.NumberKeyword
        && node.parent
        && ts.isParameter(node.parent)
    ) {
        return "Number"
    }
    return null
}
