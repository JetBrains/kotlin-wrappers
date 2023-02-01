const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "IDLE_NAVIGATION"
    ) {
        return `external val IDLE_NAVIGATION: NavigationStatesIdle`
    }

    if (
        ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "IDLE_FETCHER"
    ) {
        return `external val IDLE_FETCHER: FetcherStatesIdle<*>`
    }

    return null
}
