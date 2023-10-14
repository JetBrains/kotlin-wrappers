import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("async_hooks.d.ts")

        && ts.isIntersectionTypeNode(node)
        && node.types[0]
        && ts.isTypeReferenceNode(node.types[0])
        && ts.isIdentifier(node.types[0].typeName)
        && node.types[0].typeName.text === "Func"

        && node.parent
        && ts.isMethodDeclaration(node.parent)
        && node.parent.type === node
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "bind"
    ) {
        return "Func"
    }

    return null
}
