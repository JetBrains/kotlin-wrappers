import ts from "typescript";

const modules = [
    "dns",
    "net",
    "stream",
    "tty",
    "tls",
    "fs",
    "http",
]

export default function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "url"
        && node.right.text === "URL"
    ) {
        return "web.url.URL"
    }

    if (
        ts.isQualifiedName(node)
        && ts.isIdentifier(node.left)
        && node.left.text === "child"
    ) {
        return `node.childProcess.${render(node.right)}`
    }

    for (const module of modules) {
        if (
            ts.isQualifiedName(node)
            && ts.isQualifiedName(node.left)
            && ts.isIdentifier(node.left.left)
            && node.left.left.text === module
            && node.left.right.text === "promises"
        ) {
            return `node.${module}.${render(node.right)}`
        }

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
