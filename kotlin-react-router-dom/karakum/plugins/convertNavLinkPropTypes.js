const ts = require("typescript")

module.exports = (node, context, render) => {
    if (
        ts.isUnionTypeNode(node)

        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && (
            node.parent.name.text === "className"
            || node.parent.name.text === "style"
            || node.parent.name.text === "children"
        )

        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "NavLinkProps"
    ) {
        return render(node.types[1])
    }

    return null
}
