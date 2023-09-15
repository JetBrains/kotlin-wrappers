import ts from "typescript";
import * as karakum from "karakum";

function extractModifiers(member) {
    if (
        ts.isPropertyDeclaration(member)
        || ts.isMethodDeclaration(member)
        || ts.isConstructorDeclaration(member)
        || ts.isGetAccessorDeclaration(member)
        || ts.isSetAccessorDeclaration(member)
        || ts.isIndexSignatureDeclaration(member)
    ) {
        return Array.from(member.modifiers ?? [])
    }

    return []
}

export default {
    setup(context) {
    },

    traverse(node) {
        if (
            ts.isClassDeclaration(node)
            && node.name.text === "ErrorResponseImpl"
        ) {
            this.sourceErrorResponse = node
        }
    },

    render(node, context, next) {
        if (!this.sourceErrorResponse) return null;

        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "ErrorResponse"
        ) {
            const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

            const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

            const members = this.sourceErrorResponse.members
                .filter(member => !ts.isConstructorDeclaration(member))
                .filter(member => extractModifiers(member).every(it => it.kind !== ts.SyntaxKind.PrivateKeyword))
                .map(member => next(member))
                .join("\n")

            return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ErrorResponse {
${members}
}
            `
        }

        return null;
    },

    generate() {
        return [];
    },
}
