const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "Navigation"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        return `${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface Navigation /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
