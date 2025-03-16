plugins {
    `karakum-conventions`
}

dependencies {
    jsMainImplementation(libs.karakum) {
        exclude(group = "org.jetbrains.kotlin-wrappers")
    }

    jsMainImplementation(projects.kotlinJs)
    jsMainImplementation(projects.kotlinNode)
    jsMainImplementation(projects.kotlinTypescript)

    jsMainImplementation(devNpm(libs.npm.types.node))
}
