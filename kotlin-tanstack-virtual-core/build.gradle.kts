plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv("@tanstack/virtual-core"))
}
