package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import js.array.ReadonlyArray
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.*

class DiffieHellmanGroupPlugin : Plugin {
    private lateinit var sourceDiffieHellmanGroupNode: ClassDeclaration

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "DiffieHellman")

        sourceDiffieHellmanGroupNode = node
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        nullable {
            ensure(isVariableDeclaration(node))

            val name = node.name
            ensure(isIdentifier(name))
            ensure(name.text == "DiffieHellmanGroup")

            ""
        } ?: nullable {
            ensure(isTypeAliasDeclaration(node))
            ensure(node.name.text == "DiffieHellmanGroup")

            ""
        } ?: nullable {
            ensure(isInterfaceDeclaration(node))
            ensure(node.name.text == "DiffieHellmanGroupConstructor")

            val inheritanceModifierService =
                ensureNotNull(context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey))

            val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)

            val ownMembers = node.members.asArray()
                .mapNotNull { member ->
                    nullable {
                        ensure(
                            nullable {
                                ensure(isPropertySignature(member))

                                val propertyName = member.name
                                ensure(isIdentifier(propertyName))
                                ensure(propertyName.text == "prototype")
                            } == null
                        )

                        next(member)
                    }
                }
                .filter { it.isNotEmpty() }
                .joinToString("\n")

            val members = sourceDiffieHellmanGroupNode.members.asArray()
                .mapNotNull { member ->
                    nullable {
                        ensure(
                            nullable {
                                ensure(isMethodDeclaration(member))

                                val methodName = member.name
                                ensure(isIdentifier(methodName))
                                ensure(
                                    methodName.text == "setPublicKey"
                                            || methodName.text == "setPrivateKey"
                                )
                            } == null
                        )

                        next(member)
                    }
                }
                .filter { it.isNotEmpty() }
                .joinToString("\n")

            """
                ${ifPresent(inheritanceModifier) { "$it " }}external class DiffieHellmanGroup {
                $ownMembers
                $members
                }
            """.trimIndent()
        }
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
