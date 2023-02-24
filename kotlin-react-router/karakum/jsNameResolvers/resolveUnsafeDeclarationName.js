const ts = require("typescript")

const unsafeDeclarations = [
    "DataRouterContext",
    "DataRouterStateContext",
    "LocationContext",
    "NavigationContext",
    "RouteContext",

    "enhanceManualRouteObjects",
]

module.exports = (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `UNSAFE_${node.name.text}`
    }

    if (
        ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `UNSAFE_${node.name.text}`
    }

    return null
}
