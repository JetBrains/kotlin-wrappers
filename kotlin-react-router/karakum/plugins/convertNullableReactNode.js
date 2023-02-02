const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isUnionTypeNode(node)

        && node.types[0]
        && ts.isTypeReferenceNode(node.types[0])
        && ts.isQualifiedName(node.types[0].typeName)
        && ts.isIdentifier(node.types[0].typeName.left)
        && node.types[0].typeName.left.text === "React"
        && node.types[0].typeName.right.text === "ReactNode"

        && node.types[1]
        && ts.isLiteralTypeNode(node.types[1])
        && node.types[1].literal.kind === ts.SyntaxKind.NullKeyword
    ) {
        // remove additional nullability
        // because ReactNode already includes null
        return "react.ReactNode"
    }

    return null
}
