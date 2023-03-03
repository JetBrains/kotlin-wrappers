const ts = require("typescript")

module.exports = (node) => {
    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "Location"
    ) {
        return "LocationState"
    }

    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isTypeAliasDeclaration(node.parent.parent.parent)
        && (
            node.parent.parent.parent.name.text === "LinkNavigateOptions"
            || node.parent.parent.parent.name.text === "SubmissionNavigateOptions"
        )
    ) {
        return "LocationState?"
    }

    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "createLocation"
    ) {
        return "LocationState"
    }

    if (
        node.kind === ts.SyntaxKind.AnyKeyword

        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "state"

        && ts.isMethodSignature(node.parent.parent)
        && (
            node.parent.parent.name.text === "push"
            || node.parent.parent.name.text === "replace"
        )

        && ts.isInterfaceDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "History"
    ) {
        return "LocationState"
    }

    return null
}
