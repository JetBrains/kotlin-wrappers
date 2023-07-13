import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "Params"
    ) {
        return `typealias ${render(node.name)} = js.core.ReadonlyRecord<String, String>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Params"
    ) {
        // remove generics
        return render(node.typeName)
    }

    return null
}
