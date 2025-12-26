import ts from "typescript";

function isReactElement(node) {
    return ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "React"
        && node.typeName.right.text === "ReactElement"
}

function isJsxElement(node) {
    return ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isQualifiedName(node.typeName.left)
        && ts.isIdentifier(node.typeName.left.left)
        && node.typeName.left.left.text === "React"
        && node.typeName.left.right.text === "JSX"
        && node.typeName.right.text === "Element"
}

function isNull(type) {
    return ts.isLiteralTypeNode(type)
        && type.literal.kind === ts.SyntaxKind.NullKeyword
}

export default function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)

        && node.name
        && /^[A-Z]/.test(node.name.text)

        && node.type
        && (
            isReactElement(node.type)
            || isJsxElement(node.type)
            || (
                ts.isUnionTypeNode(node.type)
                && node.type.types[0]
                && (
                    isReactElement(node.type.types[0])
                    || isJsxElement(node.type.types[0])
                )
            )
            || isNull(node.type)
        )
    ) {
        const name = render(node.name)

        const propsType = render(node.parameters[0].type)

        return `external val ${name}: react.FC<${propsType}>`
    }
    return null
}
