import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup() {
    },

    traverse() {
    },

    render(node, context, render) {
        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "Abortable"
        ) {
            const declaration = render(node)

            if (declaration) {
                const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

                this.sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
                this.namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)
                this.declaration = declaration
            }

            return ""
        }

        return null
    },

    generate(context) {
        const configurationService = context.lookupService(karakum.configurationServiceKey)
        const configuration = configurationService?.configuration
        if (configuration === undefined) throw new Error("EventPlugin can't work without ConfigurationService")

        const namespaceInfoService = context.lookupService(karakum.namespaceInfoServiceKey)
        const resolveNamespaceStrategy = namespaceInfoService?.resolveNamespaceStrategy?.bind(namespaceInfoService)
        if (resolveNamespaceStrategy === undefined) throw new Error("EventPlugin can't work without NamespaceInfoService")

        const declaration = {
            sourceFileName: this.sourceFileName,
            namespace: this.namespace,
            fileName: "Abortable.kt",
            body: this.declaration,
        }

        return karakum.generateDerivedDeclarations([declaration], configuration, resolveNamespaceStrategy);
    },
}
