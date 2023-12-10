plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackTableCore)

    jsMainApi(npmv("@tanstack/react-table"))
}
