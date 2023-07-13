import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && (
            node.name.text === "Navigation"
            || node.name.text === "BaseSubmissionOptions"
        )
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        return `${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ${node.name.text} /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
