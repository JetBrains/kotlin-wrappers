import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default {
    setup(context) {
    },

    traverse(node) {
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("diagnostics_channel.d.ts")
            && ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && node.typeName.text === "ContextType"

            && node.parent
            && ts.isIntersectionTypeNode(node.parent)

            && node.parent.parent
            && ts.isParameter(node.parent.parent)
            && ts.isIdentifier(node.parent.parent.name)
            && node.parent.parent.name.text === "message"
        ) {
            return ""
        }

        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("diagnostics_channel.d.ts")
            && ts.isIntersectionTypeNode(node)

            && node.parent
            && ts.isParameter(node.parent)
            && ts.isIdentifier(node.parent.name)
            && node.parent.name.text === "message"

            && context.type === "MEMBER"
        ) {
            return [`
@Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)
inline val contextType: ContextType
    get() = unsafeCast<ContextType>()
            `]
        }

        return []
    },

    generate(context) {
        return []
    }
}
