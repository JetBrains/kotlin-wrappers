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
            ts.isInterfaceDeclaration(node)
            && (
                node.name.text === "IndexRouteObject"
                || node.name.text === "NonIndexRouteObject"
            )
        ) {
            return ""
        }

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

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && (
                node.typeName.text === "IndexRouteObject"
                || node.typeName.text === "NonIndexRouteObject"
            )
        ) {
            return "RouteObject"
        }

        return null;
    },

    generate() {
        return {};
    },
}
