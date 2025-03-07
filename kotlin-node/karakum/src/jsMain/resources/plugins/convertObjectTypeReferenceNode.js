import ts from "typescript";

export default function (node) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Object"
    ) {
        return "Any"
    }
    return null
}
