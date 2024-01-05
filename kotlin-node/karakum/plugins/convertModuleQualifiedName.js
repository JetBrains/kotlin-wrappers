import ts from "typescript";

const modules = [
    "dns",
    "net",
    "stream",
    "tty",
]

export default function (node, context, render) {
    for (const module of modules) {
        if (
            ts.isQualifiedName(node)
            && ts.isIdentifier(node.left)
            && node.left.text === module
        ) {
            return `node.${module}.${render(node.right)}`
        }

        if (
            ts.isPropertyAccessExpression(node)
            && ts.isIdentifier(node.expression)
            && node.expression.text === module
        ) {
            return `node.${module}.${render(node.name)}`
        }
    }

    return null
}
