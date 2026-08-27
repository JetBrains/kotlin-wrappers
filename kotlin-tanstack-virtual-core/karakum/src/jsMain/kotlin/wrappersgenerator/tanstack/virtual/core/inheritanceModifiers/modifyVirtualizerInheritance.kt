package wrappersgenerator.tanstack.virtual.core.inheritanceModifiers

import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.resolve
import io.github.sgrishchenko.karakum.extension.withName
import typescript.isClassDeclaration

val modifyVirtualizerInheritance = resolve<InheritanceModifierContext>(
    "open" to match {
        match(::isClassDeclaration, withName("Virtualizer"))
    },
)
