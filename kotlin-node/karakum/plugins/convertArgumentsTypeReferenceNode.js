import ts from "typescript";

export default function (node) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "IArguments"
    ) {

        return "js.array.ArrayLike<Any?> /* IArguments */"
    }
    return null
}
