import ts from "typescript";

export default function (node) {
    if (
        node.kind === ts.SyntaxKind.NumberKeyword
        && node.parent
        && ts.isParameter(node.parent)
    ) {

        return "Number"
    }
    return null
}
