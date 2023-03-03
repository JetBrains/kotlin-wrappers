const ts = require("typescript")

module.exports = (node) => {
    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isInterfaceDeclaration(node.parent.parent)
        && (
            node.parent.parent.name.text === "NavigateOptions"
            || node.parent.parent.name.text === "NavigateProps"
        )
    ) {
        return "remix.run.router.LocationState?"
    }

    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && node.parent
        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isMethodSignature(node.parent.parent)
        && (
            node.parent.parent.name.text === "push"
            || node.parent.parent.name.text === "replace"
        )

        && ts.isInterfaceDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "Navigator"
    ) {
        return "remix.run.router.LocationState?"
    }

    return null
}
