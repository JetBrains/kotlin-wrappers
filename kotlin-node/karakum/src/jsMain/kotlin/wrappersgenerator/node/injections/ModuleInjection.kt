package wrappersgenerator.node.injections

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import js.reflect.invoke
import typescript.*

private fun isModuleInterfaceNode(node: Node) = nullable {
    ensure(isInterfaceDeclaration(node))
    ensure(node.name.text == "Module")

    val moduleBlock = ensureNotNull(node.parent)
    ensure(isModuleBlock(moduleBlock))

    val module = ensureNotNull(moduleBlock.parent)
    ensure(isModuleDeclaration(module))

    val moduleName = module.name
    ensure(isIdentifier(moduleName))
    ensure(moduleName.text == "NodeJS")
} != null

class ModuleInjection : Injection {
    private lateinit var moduleInterfaceNode: InterfaceDeclaration

    override suspend fun setup(context: Context) = Unit

    override suspend fun traverse(node: Node, context: Context) = impure {
        ensure(isInterfaceDeclaration(node))
        ensure(isModuleInterfaceNode(node))

        moduleInterfaceNode = node
    }

    override suspend fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("module.d.ts"))

        ensure(isHeritageClause(node))

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Module")

        ""
    }

    override suspend fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("module.d.ts"))

        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Module")

        moduleInterfaceNode.members.asArray()
            .map { render(it) }
            .toTypedArray()
    }

    override suspend fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
