plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(npmv("@jetbrains/ring-ui"))
}
