import ts from "typescript";

export default function (node) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Error"
    ) {
        return "js.errors.JsError"
    }

    return null
}
