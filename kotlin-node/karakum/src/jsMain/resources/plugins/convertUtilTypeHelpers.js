import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("util.d.ts")
        && ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "IfDefaultsTrue"
            || node.typeName.text === "IfDefaultsFalse"
        )
    ) {
        return ""
    }


    return null
}
