plugins {
    `kotlin-library-conventions`
    seskar()
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("@tanstack/table-core"))
}
