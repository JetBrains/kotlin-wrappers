import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup(context) {
    },

    traverse(node) {
        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "ActionFunction"
        ) {
            this.actionFunctionNode = node
        }

        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "LoaderFunction"
        ) {
            this.loaderFunctionNode = node
        }
    },

    render(node, context, next) {
        if (
            ts.isUnionTypeNode(node)

            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "ActionFunction"

            && node.types[1]
            && node.types[1].kind === ts.SyntaxKind.BooleanKeyword
        ) {
            return "ActionLike"
        }

        if (
            ts.isUnionTypeNode(node)

            && node.types[0]
            && ts.isTypeReferenceNode(node.types[0])
            && ts.isIdentifier(node.types[0].typeName)
            && node.types[0].typeName.text === "LoaderFunction"

            && node.types[1]
            && node.types[1].kind === ts.SyntaxKind.BooleanKeyword
        ) {
            return "LoaderLike"
        }

        return null
    },

    inject(node, context, render) {
        if (context.type === karakum.InjectionType.HERITAGE_CLAUSE) {
            if (
                ts.isInterfaceDeclaration(node)
                && node.name.text === "ActionFunction"
            ) {
                return ["ActionLike"]
            }

            if (
                ts.isIntersectionTypeNode(node)
                && node.parent
                && ts.isTypeAliasDeclaration(node.parent)
                && node.parent.name.text === "LoaderFunction"
            ) {
                return ["LoaderLike"]
            }
        }

        return []
    },

    generate(context, render) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const actionSourceFileName = this.actionFunctionNode.getSourceFile()?.fileName ?? "generated.d.ts"
        const actionNamespace = typeScriptService?.findClosest(this.actionFunctionNode, ts.isModuleDeclaration)
        const actionFunctionSignatureNode = this.actionFunctionNode.members[0]
        const actionBody = karakum.convertParameterDeclarations(actionFunctionSignatureNode, context, render, {
            strategy: "lambda",
            template: parameters => {
                const typeParameterNames = this.actionFunctionNode.typeParameters
                    ?.map(typeParameter => render(typeParameter.name))
                    ?.filter(Boolean)
                    ?.join(", ")

                const typeParameters = this.actionFunctionNode.typeParameters
                    ?.map(typeParameter => render(typeParameter))
                    ?.filter(Boolean)
                    ?.join(", ")

                const returnType = render(actionFunctionSignatureNode.type)

                return `
@Suppress("NOTHING_TO_INLINE")
inline fun ${karakum.ifPresent(typeParameters, it => `<${it}>`)} ActionFunction(
    noinline value: (${parameters}) -> ${returnType},
): ActionFunction${karakum.ifPresent(typeParameterNames, it => `<${it}>`)} =
    value.unsafeCast<ActionFunction${karakum.ifPresent(typeParameterNames, it => `<${it}>`)}>()
                    `
            }
        })

        const loaderSourceFileName = this.loaderFunctionNode.getSourceFile()?.fileName ?? "generated.d.ts"
        const loaderNamespace = typeScriptService?.findClosest(this.loaderFunctionNode, ts.isModuleDeclaration)
        const loaderFunctionSignatureNode = this.loaderFunctionNode.type.types[0].members[0]
        const loaderBody = karakum.convertParameterDeclarations(loaderFunctionSignatureNode, context, render, {
            strategy: "lambda",
            template: parameters => {
                const typeParameterNames = this.loaderFunctionNode.typeParameters
                    ?.map(typeParameter => render(typeParameter.name))
                    ?.filter(Boolean)
                    ?.join(", ")

                const typeParameters = this.loaderFunctionNode.typeParameters
                    ?.map(typeParameter => render(typeParameter))
                    ?.filter(Boolean)
                    ?.join(", ")

                const returnType = render(loaderFunctionSignatureNode.type)

                return `
@Suppress("NOTHING_TO_INLINE")
inline fun ${karakum.ifPresent(typeParameters, it => `<${it}>`)} LoaderFunction(
    noinline value: (${parameters}) -> ${returnType},
): LoaderFunction${karakum.ifPresent(typeParameterNames, it => `<${it}>`)} =
    value.unsafeCast<LoaderFunction${karakum.ifPresent(typeParameterNames, it => `<${it}>`)}>()
                    `
            }
        })

        const declarations = [
            {
                sourceFileName: actionSourceFileName,
                namespace: actionNamespace,
                fileName: `ActionFunction.ext.kt`,
                body: actionBody,
            },
            {
                sourceFileName: loaderSourceFileName,
                namespace: loaderNamespace,
                fileName: `LoaderFunction.ext.kt`,
                body: loaderBody,
            }
        ]

        return karakum.generateDerivedDeclarations(declarations, context);
    }
}
