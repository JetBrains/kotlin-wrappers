const ts = require("typescript");

module.exports = {
    setup(context) {
    },

    traverse(node) {
        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "NonIndexRouteObject"
        ) {
            this.sourceRouteObjectNode = node
        }
    },

    render(node, context, next) {
        if (!this.sourceRouteObjectNode) return null;

        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "RouteObject"
        ) {
            const members = this.sourceRouteObjectNode.members
                .map(member => next(member))
                .join("\n")

            return `
external interface RouteObject {
${members}
}
            `
        }

        return null;
    },

    generate() {
        return {};
    },
}
