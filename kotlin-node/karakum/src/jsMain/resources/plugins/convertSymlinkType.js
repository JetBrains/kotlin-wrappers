import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isIdentifier(node)
        && node.text === "Type"

        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)

        && node.parent.parent
        && ts.isModuleBlock(node.parent.parent)

        && node.parent.parent.parent
        && ts.isModuleDeclaration(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "symlink"
    ) {
        return "SymlinkType"
    }

    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "symlink"
        && node.right.text === "Type"
    ) {
        return "SymlinkType"
    }

    return null
}
